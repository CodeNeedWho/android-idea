package com.jsdroid.editor.adapter;

public abstract class DataHandler {

	public abstract int getLayoutId();

	public abstract boolean canFillData(Object data);

	public abstract void fillData(int pos, Object data, DataViewHolder vh,
			DataAdapter dataAdapter);


}
