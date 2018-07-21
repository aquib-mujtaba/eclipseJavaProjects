package com.programin.$02_03.Q72;

public class Date {
	int dd;
	int mm;
	int yy;

	public Date(int dd, int mm, int yy) {
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}

	@Override
	public String toString() {
		return dd + "/" + mm + "/" + yy;
	}

	int totalDays() {
		int month[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int days = 0;
		int y = yy - 1;
		int leap = 0;
		days = y * 365;
		if (mm > 2) {
			leap = yy / 4 - yy / 100 + yy / 400;
		} else {
			leap = y / 4 - y / 100 + y / 400;
		}
		days += leap;
		for (int i = 0; i < mm; i++) {
			days = days + month[i];
		}
		days = days + dd;
		return days;
	}
}
