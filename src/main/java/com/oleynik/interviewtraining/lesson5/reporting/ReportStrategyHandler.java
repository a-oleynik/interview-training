package com.oleynik.interviewtraining.lesson5.reporting;

import com.oleynik.interviewtraining.lesson5.reporting.strategies.ExcelReportStrategy;
import com.oleynik.interviewtraining.lesson5.reporting.strategies.PdfReportStrategy;
import com.oleynik.interviewtraining.lesson5.reporting.strategies.ReportStrategy;

public class ReportStrategyHandler {
    public ReportStrategy getReportStrategy(ReportType type) {
        return switch (type) {
            case EXCEL -> new ExcelReportStrategy();
            case PDF -> new PdfReportStrategy();
            default -> throw new IllegalArgumentException("Unknown report type");
        };
    }
}
