package com.jsdroid.editor.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import com.jsdroid.editor.R;


public class BgLogoLayout extends LinearLayout {

    public BgLogoLayout(Context context) {
        super(context);
    }

    public BgLogoLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    Bitmap bg;
    Paint paint;

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //绘制图片
        if (bg == null) {
            paint = new Paint();
            bg = BitmapFactory.decodeResource(getResources(), R.drawable.icon);
            Matrix matrix = new Matrix();
            float scale = getWidth() * 0.4f / bg.getWidth();
            matrix.postScale(scale, scale);
            bg = Bitmap.createBitmap(bg, 0, 0, bg.getWidth(), bg.getHeight(), matrix, true);
        }
       // canvas.drawBitmap(bg, getWidth() / 2 - bg.getWidth() / 2, getHeight() / 2 - bg.getHeight() / 2, paint);

    }
}
