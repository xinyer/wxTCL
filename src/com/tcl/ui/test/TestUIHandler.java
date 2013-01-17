package com.tcl.ui.test;

import android.os.Bundle;
import android.os.Message;
import android.widget.Toast;

import com.tcl.ui.commons.BaseUIHandler;

public class TestUIHandler extends BaseUIHandler<Object, TestActivity>{
	
	final int MSG_OK = 0;
	final int MSG_NULL = 1;

	public TestUIHandler(TestActivity activity) {
		this.setActivity(activity);
	}
	
	@Override
	public void handleMessage(Message msg) {
		super.handleMessage(msg);
		switch(msg.what){
		case MSG_OK:
			Bundle data = msg.getData();
			int result = data.getInt("result");
			Toast.makeText(getActivity(), "result:"+result, Toast.LENGTH_LONG).show();
			break;
		case MSG_NULL:
			Toast.makeText(getActivity(), "input is null", Toast.LENGTH_LONG).show();
			break;
		}
	}
}
