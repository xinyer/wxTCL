package com.tcl.ui.commons;


import android.os.Handler;

public class BaseUIHandler<T,AppAcitvity> extends Handler {

	private T data;
	private AppAcitvity activity;
	
	public BaseUIHandler(){
		super();		
	}
	
	public BaseUIHandler(AppAcitvity appActivity){
		super();
		this.activity = appActivity;
	}
	
	
	public AppAcitvity getActivity(){
		return activity;
	}
	
	public void setActivity(AppAcitvity activity){
		 this.activity = activity;
	}
	
	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
