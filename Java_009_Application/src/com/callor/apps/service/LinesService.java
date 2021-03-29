package com.callor.apps.service;

public class LinesService {
	public static String dLines(int length) {

		String dLine = "";
		for (int i = 0; i < length; i++) {
			dLine += "=";

		}
		return dLine;

	}

	public static String sLines(int length) {

		String sLine = "";
		for (int i = 0; i < length; i++) {
			sLine += "-";

		}
		return sLine;

	}
}
