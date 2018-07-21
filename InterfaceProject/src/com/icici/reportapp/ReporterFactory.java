package com.icici.reportapp;

import java.util.Scanner;

public class ReporterFactory {
	public static IReporter getInstance() {
		System.out.println("Enter Reporter [Excel|Pdf|Browser] ");
		Scanner sc = new Scanner(System.in);
		String report = sc.next();
		sc.close();
		if (report.equalsIgnoreCase("pdf")) {
			PdfReporter pdf = new PdfReporter();
			return pdf;
		} else if (report.equalsIgnoreCase("excel")) {
			ExcelReporter exc = new ExcelReporter();
			return exc;
		} else if (report.equalsIgnoreCase("browser")) {
			BrowserReporter br = new BrowserReporter();
			return br;
		} else {
			System.out.println("Made correct Choice");
			return null;
		}
	}
}
