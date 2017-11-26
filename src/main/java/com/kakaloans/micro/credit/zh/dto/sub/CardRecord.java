package com.kakaloans.micro.credit.zh.dto.sub;

import com.google.gson.annotations.SerializedName;
import com.kakaloans.micro.credit.common.annotation.Desensitize;
import com.kakaloans.micro.credit.common.enums.ChannelResposeEnum;

public class CardRecord {

    @SerializedName(value = "cardType", alternate = "cardtype")
    private String cardType;

    @SerializedName(value = "cue")
    private String cue;

    @SerializedName(value = "state")
    private String state;

    @SerializedName(value = "financeOrg", alternate = "isscomname")
    private String financeOrg;

    @SerializedName(value = "accountDw", alternate = "businessnumber")
    private String accountDw;

    @SerializedName(value = "currency")
    @Desensitize(value = ChannelResposeEnum.Currency)
    private String currency;

    @SerializedName(value = "openDate", alternate = "issdate")
    private String openDate;

    @SerializedName(value = "creditLimitAmount", alternate = "lincre")
    @Desensitize(value = ChannelResposeEnum.SmallPercentageGrade)
    private String creditLimitAmount;

    @SerializedName(value = "guaranteeType", alternate = "guaranteetype")
    @Desensitize(value = ChannelResposeEnum.GuaranteeType)
    private String guaranteeType;

    @SerializedName(value = "shareCreditLimitAmount", alternate = "shalincre")
    @Desensitize(value = ChannelResposeEnum.SmallPercentageGrade)
    private String shareCreditLimitAmount;

    @SerializedName(value = "usedCreditLimitAmount", alternate = "usedcreditlimitamount")
    @Desensitize(value = ChannelResposeEnum.SmallPercentageGrade)
    private String usedCreditLimitAmount;

    @SerializedName(value = "latest6MonthUsedAvgAmount", alternate = "latest6monthusedavgamount")
    @Desensitize(value = ChannelResposeEnum.SmallPercentageGrade)
    private String latest6MonthUsedAvgAmount;

    @SerializedName(value = "usedHighestAmount", alternate = "usedhighestamount")
    @Desensitize(value = ChannelResposeEnum.SmallPercentageGrade)
    private String usedHighestAmount;

    @SerializedName(value = "scheduledPaymentDate", alternate = "scheduledpaymentdate")
    private String scheduledPaymentDate;

    @SerializedName(value = "scheduledPaymentAmount", alternate = "scheduledpaymentamount")
    @Desensitize(value = ChannelResposeEnum.SmallPercentageGrade)
    private String scheduledPaymentAmount;

    @SerializedName(value = "actualPaymentAmount", alternate = "actualpaymentamount")
    @Desensitize(value = ChannelResposeEnum.SmallPercentageGrade)
    private String actualPaymentAmount;

    @SerializedName(value = "recentPayDate", alternate = "recentpaydate")
    private String recentPayDate;

    @SerializedName(value = "currOverdueCyc", alternate = "curroverduecyc")
    @Desensitize(value = ChannelResposeEnum.FiveGrade)
    private String currOverdueCyc;

    @SerializedName(value = "currOverdueAmount", alternate = "curroverdueamount")
    @Desensitize(value = ChannelResposeEnum.SmallPercentageGrade)
    private String currOverdueAmount;

    @SerializedName(value = "gettime", alternate = "expdate")
    private String gettime;

    @SerializedName(value = "paymentState", alternate = "last24state")
    private String paymentState;

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCue() {
        return cue;
    }

    public void setCue(String cue) {
        this.cue = cue;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getFinanceOrg() {
        return financeOrg;
    }

    public void setFinanceOrg(String financeOrg) {
        this.financeOrg = financeOrg;
    }

    public String getAccountDw() {
        return accountDw;
    }

    public void setAccountDw(String accountDw) {
        this.accountDw = accountDw;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getOpenDate() {
        return openDate;
    }

    public void setOpenDate(String openDate) {
        this.openDate = openDate;
    }

    public String getCreditLimitAmount() {
        return creditLimitAmount;
    }

    public void setCreditLimitAmount(String creditLimitAmount) {
        this.creditLimitAmount = creditLimitAmount;
    }

    public String getGuaranteeType() {
        return guaranteeType;
    }

    public void setGuaranteeType(String guaranteeType) {
        this.guaranteeType = guaranteeType;
    }

    public String getShareCreditLimitAmount() {
        return shareCreditLimitAmount;
    }

    public void setShareCreditLimitAmount(String shareCreditLimitAmount) {
        this.shareCreditLimitAmount = shareCreditLimitAmount;
    }

    public String getUsedCreditLimitAmount() {
        return usedCreditLimitAmount;
    }

    public void setUsedCreditLimitAmount(String usedCreditLimitAmount) {
        this.usedCreditLimitAmount = usedCreditLimitAmount;
    }

    public String getLatest6MonthUsedAvgAmount() {
        return latest6MonthUsedAvgAmount;
    }

    public void setLatest6MonthUsedAvgAmount(String latest6MonthUsedAvgAmount) {
        this.latest6MonthUsedAvgAmount = latest6MonthUsedAvgAmount;
    }

    public String getUsedHighestAmount() {
        return usedHighestAmount;
    }

    public void setUsedHighestAmount(String usedHighestAmount) {
        this.usedHighestAmount = usedHighestAmount;
    }

    public String getScheduledPaymentDate() {
        return scheduledPaymentDate;
    }

    public void setScheduledPaymentDate(String scheduledPaymentDate) {
        this.scheduledPaymentDate = scheduledPaymentDate;
    }

    public String getScheduledPaymentAmount() {
        return scheduledPaymentAmount;
    }

    public void setScheduledPaymentAmount(String scheduledPaymentAmount) {
        this.scheduledPaymentAmount = scheduledPaymentAmount;
    }

    public String getActualPaymentAmount() {
        return actualPaymentAmount;
    }

    public void setActualPaymentAmount(String actualPaymentAmount) {
        this.actualPaymentAmount = actualPaymentAmount;
    }

    public String getRecentPayDate() {
        return recentPayDate;
    }

    public void setRecentPayDate(String recentPayDate) {
        this.recentPayDate = recentPayDate;
    }

    public String getCurrOverdueCyc() {
        return currOverdueCyc;
    }

    public void setCurrOverdueCyc(String currOverdueCyc) {
        this.currOverdueCyc = currOverdueCyc;
    }

    public String getCurrOverdueAmount() {
        return currOverdueAmount;
    }

    public void setCurrOverdueAmount(String currOverdueAmount) {
        this.currOverdueAmount = currOverdueAmount;
    }

    public String getGettime() {
        return gettime;
    }

    public void setGettime(String gettime) {
        this.gettime = gettime;
    }

    public String getPaymentState() {
        return paymentState;
    }

    public void setPaymentState(String paymentState) {
        this.paymentState = paymentState;
    }


}
