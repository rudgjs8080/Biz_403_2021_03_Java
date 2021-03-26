package com.callor.apps;

import com.callor.apps.service.TimeServiceV1;

public class App_01 {

	public static void main(String[] args) {

		TimeServiceV1 timeV1 = new TimeServiceV1();

		timeV1.makeNum();
		timeV1.printTime();

	}

}
