package com.tcl.ui.commons;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;

public abstract class BaseActivity<Page extends BasePage,Handler extends BaseUIHandler,Listener extends BaseListener,Help extends BaseHelp> extends Activity {
	
	private Page page;
	private Handler uiHandler;
	private Listener listener;
	private Help help;
	
	public Help getHelp() {
		return help;
	}

	public Listener getListener() {
		return listener;
	}

	public Page getPage() {
		return page;
	}

	public Handler getUIHandler() {
		return uiHandler;
	}

	public void init(Page page, Handler handler,Listener listener, Help help) {
		this.page = page;
		this.uiHandler = handler;
		this.listener = listener;
		this.help = help;
		
		this.page.setActivity(this);
		this.uiHandler.setActivity(this);
		this.listener.setActivity(this);
		this.help.setActivity(this);
		
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		ActivityManager.getInstance().activityCreate(BaseActivity.this);
	}


	@Override
	protected void onStart() {
		super.onStart();
	}

	@Override
	protected void onResume() {
		super.onResume();
	}

	@Override
	protected void onPause() {
		super.onPause();
	}

	@Override
	protected void onStop() {
		super.onStop();
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
	}
	
	@Override
	public void finish() {
		super.finish();
		ActivityManager.getInstance().activityDestory(BaseActivity.this);
	}

	@Override
	public boolean dispatchKeyEvent(KeyEvent event) {
		if (event.getAction() == KeyEvent.ACTION_DOWN) {
			//...
		}
		return super.dispatchKeyEvent(event);
	}

}
