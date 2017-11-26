package com.kakaloans.micro.credit.zh.dto.sub;

import com.google.gson.annotations.SerializedName;
import com.kakaloans.micro.credit.common.annotation.Desensitize;
import com.kakaloans.micro.credit.common.enums.ChannelResposeEnum;

public class CrdPiEndinsdpt {

    @SerializedName(value = "area")
    private String area;

    @SerializedName(value = "registerDate", alternate = "registerdate")
    private String registerDate;

    @SerializedName(value = "monthDuration", alternate = "monthduration")
    @Desensitize(value = ChannelResposeEnum.TwentyOneGrade)
    private String monthDuration;

    @SerializedName(value = "workDate", alternate = "workdate")
    private String workDate;

    @SerializedName(value = "state")
    private String state;

    @SerializedName(value = "ownBasicMoney", alternate = "ownbasicmoney")
    @Desensitize(value = ChannelResposeEnum.SmallPercentageGrade)
    private String ownBasicMoney;

    @SerializedName(value = "money")
    @Desensitize(value = ChannelResposeEnum.SmallPercentageGrade)
    private String money;

    @SerializedName(value = "organName", alternate = "organname")
    private String organName;

    @SerializedName(value = "pauseReason", alternate = "pausereason")
    private String pauseReason;

    @SerializedName(value = "getTime", alternate = "gettime")
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

    public String getMonthDuration() {
        return monthDuration;
    }

    public void setMonthDuration(String monthDuration) {
        this.monthDuration = monthDuration;
    }

    public String getWorkDate() {
        return workDate;
    }

    public void setWorkDate(String workDate) {
        this.workDate = workDate == null ? null : workDate.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getOwnBasicMoney() {
        return ownBasicMoney;
    }

    public void setOwnBasicMoney(String ownBasicMoney) {
        this.ownBasicMoney = ownBasicMoney;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getOrganName() {
        return organName;
    }

    public void setOrganName(String organName) {
        this.organName = organName == null ? null : organName.trim();
    }

    public String getPauseReason() {
        return pauseReason;
    }

    public void setPauseReason(String pauseReason) {
        this.pauseReason = pauseReason == null ? null : pauseReason.trim();
    }

    public String getGetTime() {
        return getTime;
    }

    public void setGetTime(String getTime) {
        this.getTime = getTime;
    }
}