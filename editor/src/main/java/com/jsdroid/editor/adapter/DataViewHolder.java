package com.jsdroid.editor.adapter;

import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class DataViewHolder {
    public static DataViewHolder get(DataAdapter dataAdapter, ViewGroup parent,
                                     int layoutId) {
        View contentView = null;
        if (parent.getChildCount() > 0) {
            contentView = parent.getChildAt(0);
        }
        if (contentView != null) {
            DataViewHolder vh = (DataViewHolder) contentView.getTag();
            if (vh.layoutId == layoutId) {
                return vh;
            } else {
                parent.removeAllViews();
                dataAdapter.addViewHolderCache(vh);
                vh = dataAdapter.getViewHolderCache(layoutId);
                if (vh != null) {
                    parent.removeAllViews();
                    parent.addView(vh.getContentView());
                    return vh;
                }
            }
        }
        DataViewHolder vh = new DataViewHolder(parent, layoutId);
        parent.removeAllViews();
        parent.addView(vh.getContentView());
        return vh;
    }

    private final SparseArray<View> views;
    View contentView;
    int layoutId;

    private DataViewHolder(ViewGroup parent, int layoutId) {
        this.views = new SparseArray<View>();
        this.layoutId = layoutId;
        this.contentView = LayoutInflater.from(parent.getContext()).inflate(
                layoutId, parent, false);
        this.contentView.setTag(this);
    }

    public View getContentView() {
        return contentView;
    }

    @SuppressWarnings("unchecked")
    public <T extends View> T getView(int viewId) {
        View view = views.get(viewId);
        if (view == null) {
            view = contentView.findViewById(viewId);
            views.put(viewId, view);
        }
        return (T) view;
    }

    public int getLayoutId() {
        return layoutId;
    }


    public void loadData(int viewId, ViewEvent viewEvent, ViewHelper.LoadDataCallback callback) {
        getViewHelper(viewId).loadData(viewEvent, callback);
    }

    public void loadData(View view, ViewEvent viewEvent, ViewHelper.LoadDataCallback callback) {
        new ViewHelper(view).loadData(viewEvent, callback);
    }


    public ViewHelper getViewHelper(int id) {
        return new ViewHelper(getView(id));
    }
    public ViewHelper getViewHelper() {
        return new ViewHelper(getContentView());
    }


    public void setAllEvent(ViewEvent viewEvent) {
        ViewHelper.setAllEvent(getContentView(), viewEvent);
    }


}
