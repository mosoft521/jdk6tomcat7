package com.kakaloans.micro.credit.zh.dto.sub;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TblPbocPersionalInfo {

    /**
     * 2身份信息
     */
    @SerializedName(value = "persionalinforecord")
    private List<CrdPiIdentity> persionalinforecord;

    public List<CrdPiIdentity> getPersionalinforecord() {
        return persionalinforecord;
    }

    public void setPersionalinforecord(List<CrdPiIdentity> persionalinforecord) {
        this.persionalinforecord = persionalinforecord;
    }


}
