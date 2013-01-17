package com.tcl.ui.commons;

import android.app.Activity;

public class BasePage<AppAcitvity extends Activity> {
	
	private AppAcitvity activity;
	
	public AppAcitvity getActivity(){
		return activity;
	}
	
	public void setActivity(AppAcitvity activity){
		 this.activity = activity;
	}
	

}
