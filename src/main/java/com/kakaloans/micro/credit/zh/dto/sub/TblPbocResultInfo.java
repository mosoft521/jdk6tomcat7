package com.kakaloans.micro.credit.zh.dto.sub;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TblPbocResultInfo {

    /**
     * 1信用报告主信息
     */
    @SerializedName(value = "baseinforecord")
    private List<CrdHdReport> baseinforecord;

    public List<CrdHdReport> getBaseinforecord() {
        return baseinforecord;
    }

    public void setBaseinforecord(List<CrdHdReport> baseinforecord) {
        this.baseinforecord = baseinforecord;
    }


}
