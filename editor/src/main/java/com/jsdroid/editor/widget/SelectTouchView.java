package com.jsdroid.editor.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * 文字选择遥杆
 */
public class SelectTouchView extends View {
    CodeEditText codeEditText;
    int offsetX;
    boolean isSelectMode;

    public void setCodeEditText(CodeEditText codeEditText) {
        this.codeEditText = codeEditText;
    }

    public void onMove(boolean isSelectMode, int speed, int direction) {
        if (codeEditText == null) {
            return;
        }
        if (isSelectMode) {
            int start = codeEditText.getSelectionStart();
            int end = codeEditText.getSelectionEnd();
            if (direction == 0) {
                end = end - speed;
                if (end <= 0) {
                    end = 0;
                }
                try {
                    codeEditText.setSelection(start, end);
                } catch (Exception e) {
                }
            } else {
                end = end + speed;
                if (end >= codeEditText.getText().length()) {
                    end = codeEditText.getText().length() - 1;
                }
                try {
                    codeEditText.setSelection(start, end);
                } catch (Exception e) {
                }
            }
        } else {
            int start = codeEditText.getSelectionStart();
            if (direction == 0) {
                start = start - speed;
                if (start <= 0) {
                    start = 0;
                }
            } else {
                start = start + speed;
                if (start >= codeEditText.getText().length()) {
                    start = codeEditText.getText().length() - 1;
                }
            }
            try {
                codeEditText.setSelection(start);
            } catch (Exception e) {
            }
        }
    }

    public void onUp(boolean isSelectMode, boolean isMove, int speed, int direction, int moveCount) {
        if (codeEditText == null) {
            return;

        }
        if (!isSelectMode) {
            if (moveCount < 1) {
                if (speed > 3) {
                    if (direction == 0) {
                        //滑动到行首
                        codeEditText.goHome();
                    } else {
                        //滑动到行尾
                        codeEditText.goEnd();
                    }
                } else {
                    int start = codeEditText.getSelectionStart();
                    if (direction == 0) {
                        start = start - 1;
                    } else {
                        start = start + 1;
                    }
                    try {
                        codeEditText.setSelection(start);
                    } catch (Exception e) {
                    }
                }
            }
        } else {
            if (isMove) {
                int start = codeEditText.getSelectionStart();
                int end = codeEditText.getSelectionEnd();
                if (direction == 0) {
                    try {
                        codeEditText.setSelection(start, end - 1);
                    } catch (Exception e) {
                    }
                } else {
                    try {
                        codeEditText.setSelection(start, end + 1);
                    } catch (Exception e) {
                    }
                }
            }
        }
    }

    public void onCopy() {
        if (codeEditText == null) {
            return;

        }
        codeEditText.setSelection(codeEditText.getSelectionEnd());
    }

    public SelectTouchView(Context context) {
        super(context);
        init();
    }


    public SelectTouchView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    Paint paint;

    private void init() {
        paint = new Paint();
        setLongClickable(true);

    }

    int getCenterX() {
        return getWidth() / 2;
    }

    int getCenterY() {
        return getHeight() / 2;
    }

    RectF getStrokeRect() {
        int p = getHeight() / 5;
        return new RectF(p, p, getWidth() - p, getHeight() - p);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint.setAntiAlias(true);
        //边框
        paint.setColor(0xffffffff);
        paint.setStrokeWidth(3);
        paint.setStyle(Paint.Style.STROKE);
        RectF stroke = getStrokeRect();
        canvas.drawRoundRect(stroke, stroke.height() / 2, stroke.height() / 2, paint);
        //手势球
        paint.setColor(0xffffffff);
        if (isSelectMode) {
            paint.setStyle(Paint.Style.FILL);
        } else {
            paint.setStyle(Paint.Style.STROKE);
        }
        //计算是否碰边
        int circleX = offsetX + getCenterX();
        float radius = stroke.height() / 2 - 5;
        if (circleX < radius + 5) {
            circleX = (int) (radius + 5);
        }
        if (circleX > getWidth() - radius - 5) {
            circleX = (int) (getWidth() - radius - 5);
        }
        canvas.drawCircle(circleX, getCenterY(), radius, paint);
        //绘制速度
        if (isMove) {
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTextSize(stroke.height() / 2);
            float ascent = paint.getFontMetrics().ascent;
            float descent = paint.getFontMetrics().descent;
            paint.setStyle(Paint.Style.FILL);
            canvas.drawText("speed:" + (direction == 0 ? -speed : speed), getCenterX(), getCenterY() - (ascent + descent) / 2, paint);
        }
    }

    boolean isMove;
    boolean moving;
    int moveCount;
    float downX, downY;
    float eventX, eventY;

    //移动速度
    int speed = 1;
    int direction = 0;
    long lastMoveTime;

    void move() {
        if (isMove) {
            long time = System.currentTimeMillis() - lastMoveTime;
            if (eventX > downX) {
                direction = 1;
            } else {
                direction = 0;
            }
            if ((moveCount == 0 && time > 300) || (moveCount > 0 && time > 300 / speed)) {
                lastMoveTime = System.currentTimeMillis();
                moveCount++;
                onMove(isSelectMode, speed, direction);

            }
            int sleepTime = 300 / speed + 10;
            if (moveCount == 0) {
                sleepTime = 300;
            }
            postDelayed(new Runnable() {
                @Override
                public void run() {
                    move();
                }
            }, sleepTime);
        }


    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        eventX = event.getX();
        eventY = event.getY();
        switch (event.getAction() & MotionEvent.ACTION_MASK) {
            case MotionEvent.ACTION_DOWN:
                lastMoveTime = System.currentTimeMillis();
                downX = event.getX();
                downY = event.getY();
                moveCount = 0;
                moving = false;
                isMove = false;
                break;
            case MotionEvent.ACTION_MOVE:
                //计算移动速度
                speed = (int) (1 + Math.abs(eventX - downX) / getStrokeRect().width() * 3f);
                if (isMove) {
                    if (!moving) {
                        moving = true;
                        move();
                    }
                } else {
                    if (Math.abs(eventX - downX) > 5 || Math.abs(eventY - downY) > 5) {
                        isMove = true;
                    }
                }
                offsetX = (int) (eventX - downX);
                break;
            case MotionEvent.ACTION_UP:
                offsetX = 0;
                if (!isMove) {
                    if (isSelectMode) {
                        isSelectMode = false;
                        onCopy();
                        invalidate();
                        return true;
                    } else {
                        isSelectMode = true;
                    }
                }
                onUp(isSelectMode, isMove, speed, direction, moveCount);
                isMove = false;
                break;
        }
        invalidate();
        return true;
    }
}
