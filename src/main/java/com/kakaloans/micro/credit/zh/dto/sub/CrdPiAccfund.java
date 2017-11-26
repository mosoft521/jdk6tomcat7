package com.kakaloans.micro.credit.zh.dto.sub;

import com.google.gson.annotations.SerializedName;
import com.kakaloans.micro.credit.common.annotation.Desensitize;
import com.kakaloans.micro.credit.common.enums.ChannelResposeEnum;

public class CrdPiAccfund {

    @SerializedName(value = "area", alternate = "priaccount")
    private String area;

    @SerializedName(value = "registerDate", alternate = "prioadate")
    private String registerDate;

    @SerializedName(value = "firstMonth", alternate = "prifirsthotdate")
    private String firstMonth;

    @SerializedName(value = "toMonth", alternate = "prilasthotdate")
    private String toMonth;

    @SerializedName(value = "state", alternate = "pri24monthretst")
    private String state;

    @SerializedName(value = "pay", alternate = "primonthpaydeposit")
    @Desensitize(value = ChannelResposeEnum.SmallPercentageGrade)
    private String pay;

    @SerializedName(value = "ownPercent", alternate = "pripaydepositper")
    private String ownPercent;

    @SerializedName(value = "comPercent", alternate = "pripaydepositcom")
    private String comPercent;

    @SerializedName(value = "organName", alternate = "priemp")
    private String organName;

    @SerializedName(value = "getTime", alternate = "priinfodate")
    private String getTime;

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(String registerDate) {
        this.registerDate = registerDate == null ? null : registerDate.trim();
    }

    public String getFirstMonth() {
        return firstMonth;
    }

    public void setFirstMonth(String firstMonth) {
        this.firstMonth = firstMonth == null ? null : firstMonth.trim();
    }

    public String getToMonth() {
        return toMonth;
    }

    public void setToMonth(String toMonth) {
        this.toMonth = toMonth == null ? null : toMonth.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getPay() {
        return pay;
    }

    public void setPay(String pay) {
        this.pay = pay;
    }

    public String getOwnPercent() {
        return ownPercent;
    }

    public void setOwnPercent(String ownPercent) {
        this.ownPercent = ownPercent == null ? null : ownPercent.trim();
    }

    public String getComPercent() {
        return comPercent;
    }

    public void setComPercent(String comPercent) {
        this.comPercent = comPercent == null ? null : comPercent.trim();
    }

    public String getOrganName() {
        return organName;
    }

    public void setOrganName(String organName) {
        this.organName = organName == null ? null : organName.trim();
    }

    public String getGetTime() {
        return getTime;
    }

    public void setGetTime(String getTime) {
        this.getTime = getTime;
    }
}