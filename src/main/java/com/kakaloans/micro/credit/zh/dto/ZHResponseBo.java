package com.kakaloans.micro.credit.zh.dto;

public class ZHResponseBo {

    private ZHCreditInfoResponseBo creditData;

    private ZHCalculateDataResponseBo calculateData;

    public ZHCreditInfoResponseBo getCreditData() {
        return creditData;
    }

    public void setCreditData(ZHCreditInfoResponseBo creditData) {
        this.creditData = creditData;
    }

    public ZHCalculateDataResponseBo getCalculateData() {
        return calculateData;
    }

    public void setCalculateData(ZHCalculateDataResponseBo calculateData) {
        this.calculateData = calculateData;
    }


}
