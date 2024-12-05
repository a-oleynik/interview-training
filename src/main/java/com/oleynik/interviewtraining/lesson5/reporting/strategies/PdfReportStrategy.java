package com.oleynik.interviewtraining.lesson5.reporting.strategies;

public class PdfReportStrategy implements ReportStrategy {
    @Override
    public void generate() {
        System.out.println("Fetching data for PDF...");
        System.out.println("Formatting data for PDF...");
        System.out.println("Generating PDF report...");
    }
}
