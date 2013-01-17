package com.tcl.ui.test;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.tcl.R;
import com.tcl.ui.commons.BaseActivity;

public class TestActivity extends BaseActivity<TestPage,TestUIHandler,TestListener,TestHelp>{

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.test);
		init(new TestPage(), new TestUIHandler(this), new TestListener(), new TestHelp());
		
		getPage().setTest0((EditText)findViewById(R.id.edittext0));
		getPage().setTest1((EditText)findViewById(R.id.edittext1));
		getPage().setButton((Button)findViewById(R.id.button));
		getPage().button.setOnClickListener(getListener());
		
	}
}
