package com.icici.reportapp;

public class LoanModule {

	public static void main(String[] args) {
		IReporter inst = ReporterFactory.getInstance();
		if (inst != null) {
			inst.genReport();
		}

	}

}
