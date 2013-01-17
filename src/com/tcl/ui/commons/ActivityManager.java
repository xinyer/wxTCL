package com.tcl.ui.commons;

import java.util.ArrayList;
import android.app.Activity;

public class ActivityManager {

	private int activityCount = 0;
	private static ActivityManager manager;
	private ArrayList<Activity> activityList = new ArrayList<Activity>();

	public static ActivityManager getInstance() {
		if (manager == null) {
			manager = new ActivityManager();
		}
		return manager;
	}

	public void activityCreate(Activity activity) {
		activityList.add(activity);
		++activityCount;
	}

	public void activityDestory(Activity activity) {
		activityList.remove(activity);
		if ((--activityCount) == 0) {
			// ...
		}
	}

	public void exitAll() {
		while (activityList.size() != 0) {
			Activity activity = activityList.get(0);
			activity.finish();
		}
	}
}
