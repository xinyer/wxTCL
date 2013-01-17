package com.tcl.ui.commons;

import android.view.View.OnClickListener;

import android.view.View.OnFocusChangeListener;

import android.widget.AdapterView.OnItemClickListener;

public abstract class BaseListener<AppActivity extends BaseActivity > 
	implements OnClickListener, OnItemClickListener,OnFocusChangeListener{

	private AppActivity activity;
	public AppActivity getActivity(){
		return activity;
	}
	protected void setActivity(AppActivity activity){
		 this.activity = activity;
	}
}
