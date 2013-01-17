package com.tcl.ui.test;

import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.widget.AdapterView;

import com.tcl.R;
import com.tcl.ui.commons.BaseListener;

public class TestListener extends BaseListener<TestActivity>{

	@Override
	public void onClick(View view) {
		int id = view.getId();
		switch(id){
		case R.id.button:
			String num0 = getActivity().getPage().test0.getText().toString().trim();
			String num1 = getActivity().getPage().test1.getText().toString().trim();
			Message msg = new Message();
			if(!num0.equals("")&&!num1.equals("")){
				int result = Integer.parseInt(num0) + Integer.parseInt(num1);
				
				msg.what = getActivity().getUIHandler().MSG_OK;
				Bundle bundle = new Bundle();
				bundle.putInt("result", result);
				msg.setData(bundle);
				
			}else{
				msg.what = getActivity().getUIHandler().MSG_NULL;
			}
			
			getActivity().getUIHandler().sendMessage(msg);
			break;
		default:
				
		}
	}

	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFocusChange(View arg0, boolean arg1) {
		// TODO Auto-generated method stub
		
	}

	
}
