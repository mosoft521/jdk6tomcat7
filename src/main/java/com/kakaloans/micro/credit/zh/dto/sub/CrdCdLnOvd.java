package com.kakaloans.micro.credit.zh.dto.sub;

import com.google.gson.annotations.SerializedName;
import com.kakaloans.micro.credit.common.annotation.Desensitize;
import com.kakaloans.micro.credit.common.enums.ChannelResposeEnum;

public class CrdCdLnOvd {

    @SerializedName(value = "monthDw", alternate = "monthdw")
    @Desensitize(value = ChannelResposeEnum.ElevenGrade2)
    private String monthDw;

    @SerializedName(value = "lastMonths", alternate = "lastmonths")
    @Desensitize(value = ChannelResposeEnum.ElevenGrade2)
    private String lastMonths;

    @SerializedName(value = "amount")
    @Desensitize(value = ChannelResposeEnum.SmallPercentageGrade)
    private String amount;

    public String getMonthDw() {
        return monthDw;
    }

    public void setMonthDw(String monthDw) {
        this.monthDw = monthDw == null ? null : monthDw.trim();
    }

    public String getLastMonths() {
        return lastMonths;
    }

    public void setLastMonths(String lastMonths) {
        this.lastMonths = lastMonths;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}