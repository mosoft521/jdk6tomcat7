package com.kakaloans.micro.credit.zh.dto.sub;

import com.google.gson.annotations.SerializedName;
import com.kakaloans.micro.credit.common.annotation.Desensitize;
import com.kakaloans.micro.credit.common.enums.ChannelResposeEnum;

public class Sumarryrecord {

    @SerializedName(value = "houseLoanCount", alternate = "houseloancount")
    @Desensitize(value = ChannelResposeEnum.ElevenGrade)
    private String houseLoanCount;

    @SerializedName(value = "otherLoanCount", alternate = "otherloancount")
    @Desensitize(value = ChannelResposeEnum.ElevenGrade)
    private String otherLoanCount;

    @SerializedName(value = "firstLoanOpenMonth", alternate = "firstloanopenmonth")
    private String firstLoanOpenMonth;

    @SerializedName(value = "loancardCount", alternate = "loancardcount")
    @Desensitize(value = ChannelResposeEnum.ElevenGrade)
    private String loancardCount;

    @SerializedName(value = "firstLoancardOpenMonth", alternate = "firstloancardopenmonth")
    private String firstLoancardOpenMonth;

    @SerializedName(value = "standardLoancardCount", alternate = "standardloancardcount")
    @Desensitize(value = ChannelResposeEnum.ElevenGrade)
    private String standardLoancardCount;

    @SerializedName(value = "firstSlOpenMonth", alternate = "fstandardloancardopenmonth")
    private String firstSlOpenMonth;

    @SerializedName(value = "announceCount", alternate = "announcecount")
    @Desensitize(value = ChannelResposeEnum.SixGrade)
    private String announceCount;

    @SerializedName(value = "dissentCount", alternate = "dissentcount")
    @Desensitize(value = ChannelResposeEnum.SixGrade)
    private String dissentCount;

    @SerializedName(value = "countDw", alternate = "loanoverduecount")
    @Desensitize(value = ChannelResposeEnum.ElevenGrade)
    private String countDw;

    @SerializedName(value = "months", alternate = "loanoverduemonths")
    @Desensitize(value = ChannelResposeEnum.ElevenGrade2)
    private String months;

    @SerializedName(value = "highestOaPerMon", alternate = "loanoverduehigestamountpm")
    @Desensitize(value = ChannelResposeEnum.SmallPercentageGrade)
    private String highestOaPerMon;

    @SerializedName(value = "maxDuration", alternate = "loanoverduemaxduration")
    @Desensitize(value = ChannelResposeEnum.ElevenGrade2)
    private String maxDuration;

    @SerializedName(value = "countDw2", alternate = "loancardoverduecount")
    @Desensitize(value = ChannelResposeEnum.ElevenGrade)
    private String countDw2;

    @SerializedName(value = "months2", alternate = "loancardoverduemonths")
    @Desensitize(value = ChannelResposeEnum.ElevenGrade2)
    private String months2;

    @SerializedName(value = "highestOaPerMon2", alternate = "loancardoverduehamountpm")
    @Desensitize(value = ChannelResposeEnum.SmallPercentageGrade)
    private String highestOaPerMon2;

    @SerializedName(value = "maxDuration2", alternate = "loancardoverduemaxduration")
    @Desensitize(value = ChannelResposeEnum.ElevenGrade2)
    private String maxDuration2;

    @SerializedName(value = "countDw3", alternate = "sloancardoduecount")
    @Desensitize(value = ChannelResposeEnum.ElevenGrade)
    private String countDw3;

    @SerializedName(value = "months3", alternate = "sloancardoduemonths")
    @Desensitize(value = ChannelResposeEnum.ElevenGrade2)
    private String months3;

    @SerializedName(value = "highestOaPerMon3", alternate = "sloancardoduehamountpm")
    @Desensitize(value = ChannelResposeEnum.SmallPercentageGrade)
    private String highestOaPerMon3;

    @SerializedName(value = "maxDuration3", alternate = "sloancardoduemaxduration")
    @Desensitize(value = ChannelResposeEnum.ElevenGrade2)
    private String maxDuration3;

    @SerializedName(value = "financeCorpCount", alternate = "undestyryloancardfanccount")
    @Desensitize(value = ChannelResposeEnum.ElevenGrade)
    private String financeCorpCount;

    @SerializedName(value = "financeOrgCount", alternate = "undestyryloancardorgcount")
    @Desensitize(value = ChannelResposeEnum.ElevenGrade)
    private String financeOrgCount;

    @SerializedName(value = "accountCount", alternate = "undestyryloancardaccountcoun")
    @Desensitize(value = ChannelResposeEnum.ElevenGrade)
    private String accountCount;

    @SerializedName(value = "creditLimit", alternate = "undestyryloancardcreditlimit")
    @Desensitize(value = ChannelResposeEnum.BigPercentageGrade)
    private String creditLimit;

    @SerializedName(value = "maxCreditLimitPerOrg", alternate = "undestyryloancardmaxcredit")
    @Desensitize(value = ChannelResposeEnum.SmallPercentageGrade)
    private String maxCreditLimitPerOrg;

    @SerializedName(value = "minCreditLimitPerOrg", alternate = "undestyryloancardmincredit")
    @Desensitize(value = ChannelResposeEnum.SmallPercentageGrade)
    private String minCreditLimitPerOrg;

    @SerializedName(value = "usedCreditLimit", alternate = "undestyryloancardusedcredit")
    @Desensitize(value = ChannelResposeEnum.BigPercentageGrade)
    private String usedCreditLimit;

    @SerializedName(value = "latest6mUsedAvgAmount", alternate = "undestyryloancardusedavg6")
    @Desensitize(value = ChannelResposeEnum.BigPercentageGrade)
    private String latest6mUsedAvgAmount;

    public String getHouseLoanCount() {
        return houseLoanCount;
    }

    public void setHouseLoanCount(String houseLoanCount) {
        this.houseLoanCount = houseLoanCount;
    }

    public String getOtherLoanCount() {
        return otherLoanCount;
    }

    public void setOtherLoanCount(String otherLoanCount) {
        this.otherLoanCount = otherLoanCount;
    }

    public String getFirstLoanOpenMonth() {
        return firstLoanOpenMonth;
    }

    public void setFirstLoanOpenMonth(String firstLoanOpenMonth) {
        this.firstLoanOpenMonth = firstLoanOpenMonth;
    }

    public String getLoancardCount() {
        return loancardCount;
    }

    public void setLoancardCount(String loancardCount) {
        this.loancardCount = loancardCount;
    }

    public String getFirstLoancardOpenMonth() {
        return firstLoancardOpenMonth;
    }

    public void setFirstLoancardOpenMonth(String firstLoancardOpenMonth) {
        this.firstLoancardOpenMonth = firstLoancardOpenMonth;
    }

    public String getStandardLoancardCount() {
        return standardLoancardCount;
    }

    public void setStandardLoancardCount(String standardLoancardCount) {
        this.standardLoancardCount = standardLoancardCount;
    }

    public String getFirstSlOpenMonth() {
        return firstSlOpenMonth;
    }

    public void setFirstSlOpenMonth(String firstSlOpenMonth) {
        this.firstSlOpenMonth = firstSlOpenMonth;
    }

    public String getAnnounceCount() {
        return announceCount;
    }

    public void setAnnounceCount(String announceCount) {
        this.announceCount = announceCount;
    }

    public String getDissentCount() {
        return dissentCount;
    }

    public void setDissentCount(String dissentCount) {
        this.dissentCount = dissentCount;
    }

    public String getCountDw() {
        return countDw;
    }

    public void setCountDw(String countDw) {
        this.countDw = countDw;
    }

    public String getMonths() {
        return months;
    }

    public void setMonths(String months) {
        this.months = months;
    }

    public String getHighestOaPerMon() {
        return highestOaPerMon;
    }

    public void setHighestOaPerMon(String highestOaPerMon) {
        this.highestOaPerMon = highestOaPerMon;
    }

    public String getMaxDuration() {
        return maxDuration;
    }

    public void setMaxDuration(String maxDuration) {
        this.maxDuration = maxDuration;
    }

    public String getCountDw2() {
        return countDw2;
    }

    public void setCountDw2(String countDw2) {
        this.countDw2 = countDw2;
    }

    public String getMonths2() {
        return months2;
    }

    public void setMonths2(String months2) {
        this.months2 = months2;
    }

    public String getHighestOaPerMon2() {
        return highestOaPerMon2;
    }

    public void setHighestOaPerMon2(String highestOaPerMon2) {
        this.highestOaPerMon2 = highestOaPerMon2;
    }

    public String getMaxDuration2() {
        return maxDuration2;
    }

    public void setMaxDuration2(String maxDuration2) {
        this.maxDuration2 = maxDuration2;
    }

    public String getCountDw3() {
        return countDw3;
    }

    public void setCountDw3(String countDw3) {
        this.countDw3 = countDw3;
    }

    public String getMonths3() {
        return months3;
    }

    public void setMonths3(String months3) {
        this.months3 = months3;
    }

    public String getHighestOaPerMon3() {
        return highestOaPerMon3;
    }

    public void setHighestOaPerMon3(String highestOaPerMon3) {
        this.highestOaPerMon3 = highestOaPerMon3;
    }

    public String getMaxDuration3() {
        return maxDuration3;
    }

    public void setMaxDuration3(String maxDuration3) {
        this.maxDuration3 = maxDuration3;
    }

    public String getFinanceCorpCount() {
        return financeCorpCount;
    }

    public void setFinanceCorpCount(String financeCorpCount) {
        this.financeCorpCount = financeCorpCount;
    }

    public String getFinanceOrgCount() {
        return financeOrgCount;
    }

    public void setFinanceOrgCount(String financeOrgCount) {
        this.financeOrgCount = financeOrgCount;
    }

    public String getAccountCount() {
        return accountCount;
    }

    public void setAccountCount(String accountCount) {
        this.accountCount = accountCount;
    }

    public String getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(String creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String getMaxCreditLimitPerOrg() {
        return maxCreditLimitPerOrg;
    }

    public void setMaxCreditLimitPerOrg(String maxCreditLimitPerOrg) {
        this.maxCreditLimitPerOrg = maxCreditLimitPerOrg;
    }

    public String getMinCreditLimitPerOrg() {
        return minCreditLimitPerOrg;
    }

    public void setMinCreditLimitPerOrg(String minCreditLimitPerOrg) {
        this.minCreditLimitPerOrg = minCreditLimitPerOrg;
    }

    public String getUsedCreditLimit() {
        return usedCreditLimit;
    }

    public void setUsedCreditLimit(String usedCreditLimit) {
        this.usedCreditLimit = usedCreditLimit;
    }

    public String getLatest6mUsedAvgAmount() {
        return latest6mUsedAvgAmount;
    }

    public void setLatest6mUsedAvgAmount(String latest6mUsedAvgAmount) {
        this.latest6mUsedAvgAmount = latest6mUsedAvgAmount;
    }


}
