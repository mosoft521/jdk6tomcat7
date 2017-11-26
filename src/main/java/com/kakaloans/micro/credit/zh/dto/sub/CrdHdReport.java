package com.kakaloans.micro.credit.zh.dto.sub;

import com.google.gson.annotations.SerializedName;

public class CrdHdReport {

    @SerializedName(value = "reportSn", alternate = "reportsn")
    private String reportSn;

    @SerializedName(value = "queryTime", alternate = "querytime")
    private String queryTime;

    @SerializedName(value = "reportCreateTime", alternate = "reportcreatetime")
    private String reportCreateTime;

    public String getReportSn() {
        return reportSn;
    }

    public void setReportSn(String reportSn) {
        this.reportSn = reportSn == null ? null : reportSn.trim();
    }

    public String getQueryTime() {
        return queryTime;
    }

    public void setQueryTime(String queryTime) {
        this.queryTime = queryTime;
    }

    public String getReportCreateTime() {
        return reportCreateTime;
    }

    public void setReportCreateTime(String reportCreateTime) {
        this.reportCreateTime = reportCreateTime;
    }
}