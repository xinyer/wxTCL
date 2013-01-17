package com.tcl.ui.test;

import android.widget.Button;
import android.widget.EditText;

import com.tcl.ui.commons.BasePage;

public class TestPage extends BasePage<TestActivity>{

	EditText test0;
	EditText test1;
	Button button;
	
	public void setTest0(EditText test0) {
		this.test0 = test0;
	}
	
	public void setTest1(EditText test1) {
		this.test1 = test1;
	}
	
	public void setButton(Button button) {
		this.button = button;
	}
}
