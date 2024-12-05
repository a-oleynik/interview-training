package com.oleynik.interviewtraining.lesson5.reporting;

import com.oleynik.interviewtraining.lesson5.reporting.strategies.ReportStrategy;

public class Main {
    public static void main(String[] args) {
        ReportStrategy excelReportStrategy = new ReportStrategyHandler().getReportStrategy(ReportType.EXCEL);
        excelReportStrategy.generate();

        ReportStrategy pdfReportStrategy = new ReportStrategyHandler().getReportStrategy(ReportType.EXCEL);
        pdfReportStrategy.generate();
    }
}
