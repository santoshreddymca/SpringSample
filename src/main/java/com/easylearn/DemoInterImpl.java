package com.easylearn;

import java.util.Calendar;
import java.util.Date;

public class DemoInterImpl implements DemoInter {

	private String message;

	public void setMessage(String message) {
		System.out.println("Setter Injection is performed....!!!!");
		this.message = message;
	}

	public DemoInterImpl() {
		System.out.println("DemoInterImpl class object is created....!!!!");
	}

	public String wish(String userName) {
		int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);

		String wishMsg = null;

		if (hour < 12) {
			wishMsg = "Good Morning";
		} else if (hour >= 12 && hour <= 17) {
			wishMsg = "Good Afternoon";
		} else {
			wishMsg = "Good Evening";
		}

		return wishMsg + " --> " + userName + "  -- Dependency Injected message:::" + message;
	}

	public void getCurrentDateAndTime() {
		Date date = new Date();
		System.out.println("Current Date And Time ::: " + date);

	}

}
