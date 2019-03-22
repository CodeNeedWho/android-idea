package com.jsdroid.editor.adapter;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.TextView;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ViewHelper {
    public interface LoadDataCallback<T> {

        public void onPreLoad(ViewHelper viewHelper);

        public T doInBackground() throws Exception;

        public void onFailed(ViewHelper viewHelper);

        public void onResult(ViewHelper viewHelper, T o);


    }

    public static class LoadDataAdapter<T> implements LoadDataCallback<T> {


        @Override
        public void onPreLoad(ViewHelper viewHelper) {

        }

        @Override
        public T doInBackground() throws Exception {

            return null;
        }

        @Override
        public void onFailed(ViewHelper viewHelper) {

        }

        @Override
        public void onResult(ViewHelper viewHelper, T o) {
        }

    }

    public static class LoadDataAsync {
        private static ExecutorService threadPool = Executors.newCachedThreadPool();
        View view;
        ViewHelper viewHelper;
        ViewEvent viewEvent;
        LoadDataCallback callback;
        Object result = null;

        public LoadDataAsync(View view, ViewEvent viewEvent, LoadDataCallback callback) {
            this.view = view;
            this.viewEvent = viewEvent;
            this.callback = callback;
            this.viewHelper = new ViewHelper(view);
        }


        public void execute() {
            callback.onPreLoad(viewHelper);
            threadPool.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        result = callback.doInBackground();
                    } catch (Exception e) {
                    }
                    if (result == null) {
                        view.post(new Runnable() {
                            @Override
                            public void run() {
                                callback.onFailed(viewHelper);
                            }
                        });

                    } else {
                        view.post(new Runnable() {
                            @Override
                            public void run() {
                                callback.onResult(viewHelper, result);
                            }
                        });

                    }
                }
            });
        }

    }

    public static void setAllEvent(View view, ViewEvent viewEvent) {
        new ViewHelper(view).setEvent(viewEvent);
        if (view instanceof ViewGroup) {
            for (int i = 0; i < ((ViewGroup) view).getChildCount(); i++) {
                setAllEvent(((ViewGroup) view).getChildAt(i), viewEvent);
            }
        }
    }

    public static ViewHelper getViewHelper(View root, int id) {
        return new ViewHelper(root.findViewById(id));
    }

    public static ViewHelper getViewHelper(Activity activity, int id) {
        return new ViewHelper(activity.findViewById(id));
    }


    View mView;
    ViewEvent mViewEvent;

    public ViewHelper(View view) {
        this.mView = view;
    }

    public ViewHelper(Activity activity) {
        this.mView = activity.getWindow().getDecorView();
    }

    public View getView() {
        return mView;
    }

    public View getView(int id) {
        return getViewHelper(id).getView();
    }

    public CharSequence getText() {
        if (mView instanceof TextView) {
            return ((TextView) mView).getText();
        }
        return null;
    }

    public CharSequence getText(int id) {
        return getViewHelper(id).getText();
    }

    public void setText(final String text) {
        if (mView instanceof TextView) {
            ((TextView) mView).setText(text);
        }
    }

    public void setText(int id, final String text) {
        getViewHelper(id).setText(text);
    }


    public void setChecked(final boolean checked) {
        if (mView instanceof Checkable) {
            if (mViewEvent != null) {
                mViewEvent.setEnable(false);
            }
            ((Checkable) mView).setChecked(checked);
            if (mViewEvent != null) {
                mViewEvent.setEnable(true);
            }
        }
    }


    public void setChecked(int id, final boolean checked) {
        getViewHelper(id).setChecked(checked);
    }

    public void setChecked(final boolean checked, ViewEvent viewEvent) {
        setChecked(checked);
    }

    public void setChecked(int id, final boolean checked, ViewEvent viewEvent) {
        getViewHelper(id).setChecked(checked, viewEvent);
    }

    public void setEvent(ViewEvent event) {
        mViewEvent = event;
        event.event(mView);
    }

    public void setEvent(int id, ViewEvent event) {
        getViewHelper(id).setEvent(event);
    }

    public boolean isChecked() {
        if (mView instanceof Checkable) {
            return ((Checkable) mView).isChecked();
        }
        return false;
    }

    public boolean isChecked(int id) {
        return getViewHelper(id).isChecked();
    }

    public void setVisibility(int visibility) {
        mView.setVisibility(visibility);
    }

    public void setVisibility(int id, int visibility) {
        getViewHelper(id).setVisibility(visibility);
    }

    public void setAllEvent(ViewEvent viewEvent) {
        setAllEvent(mView, viewEvent);
    }

    public void loadData(ViewEvent viewEvent, LoadDataCallback callback) {
        new LoadDataAsync(mView, viewEvent, callback).execute();
    }

    public ViewHelper getViewHelper(int id) {
        return new ViewHelper(mView.findViewById(id));
    }


}
