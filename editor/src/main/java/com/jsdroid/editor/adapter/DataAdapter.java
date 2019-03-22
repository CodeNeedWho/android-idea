package com.jsdroid.editor.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class DataAdapter extends BaseAdapter {

	List datas;
	List<DataHandler> dataHandlers;
	Context context;
	List<DataViewHolder> viewHolderCaches;

	public void setDatas(List datas) {
		this.datas = datas;
	}

	public DataAdapter(Context context) {
		dataHandlers = new ArrayList<DataHandler>();
		datas = new ArrayList();
		viewHolderCaches = new ArrayList<DataViewHolder>();
	}

	public void addDataHandler(DataHandler dataHandler) {
		dataHandlers.add(dataHandler);
	}

	public void addData(Object data) {
		if (!datas.contains(data))
			datas.add(data);
	}

	public void clear() {
		if (datas != null)
			datas.clear();
	}

	public void delete(int i) {
		datas.remove(i);
	}

	@Override
	public int getCount() {
		return datas == null ? 0 : datas.size();
	}

	@Override
	public Object getItem(int position) {
		return datas.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		Object data = datas.get(position);
		return getView(position, data, convertView, parent);
	}

	private DataHandler getDataHandler(int pos, Object data) {
		for (DataHandler dataHandler : dataHandlers) {
			if (dataHandler.canFillData(data) || dataHandler.canFillData(pos)) {
				return dataHandler;
			}
		}
		return null;
	}

	public DataViewHolder getViewHolderCache(int layoutId) {
		for (int i = 0; i < viewHolderCaches.size(); i++) {
			DataViewHolder vh = viewHolderCaches.get(i);
			if (vh.getLayoutId() == layoutId) {
				viewHolderCaches.remove(i);
				return vh;
			}
		}
		return null;
	}

	public void addViewHolderCache(DataViewHolder vh) {
		viewHolderCaches.add(vh);
	}

	/**
	 * 1.如果缓存中有对应数据的contentview
	 * 
	 * @param data
	 * @param convertView
	 * @param parent
	 * @return
	 */
	private View getView(int position, Object data, View convertView,
			ViewGroup parent) {
		LinearLayout layout = null;
		if (convertView == null) {
			layout = new LinearLayout(parent.getContext());
		} else {
			layout = (LinearLayout) convertView;
		}
		DataHandler dataHandler = getDataHandler(position, data);
		DataViewHolder vh = DataViewHolder.get(this, layout,
				dataHandler.getLayoutId());
		dataHandler.fillData(position, data, vh, this);
		return layout;
	}

	public <T extends Object> T getData(int pos) {

		return (T) datas.get(pos);
	}
}
