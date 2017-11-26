package com.kakaloans.micro.credit.zh.dto.sub;

import com.google.gson.annotations.SerializedName;
import com.kakaloans.micro.credit.common.annotation.Desensitize;
import com.kakaloans.micro.credit.common.enums.ChannelResposeEnum;

public class CrdPiProfessnl {

    @SerializedName(value = "employer")
    private String employer;

    @SerializedName(value = "employerAddress", alternate = "employeraddress")
    private String employerAddress;

    @SerializedName(value = "occupation")
    @Desensitize(value = ChannelResposeEnum.Occupation)
    private String occupation;

    @SerializedName(value = "industry")
    @Desensitize(value = ChannelResposeEnum.Industry)
    private String industry;

    @SerializedName(value = "duty")
    @Desensitize(value = ChannelResposeEnum.Duty)
    private String duty;

    @SerializedName(value = "titleDw", alternate = "title")
    @Desensitize(value = ChannelResposeEnum.Title)
    private String titleDw;

    @SerializedName(value = "startYear", alternate = "startyear")
    private String startYear;

    @SerializedName(value = "getTime", alternate = "gettime")
    private String getTime;

    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer == null ? null : employer.trim();
    }

    public String getEmployerAddress() {
        return employerAddress;
    }

    public void setEmployerAddress(String employerAddress) {
        this.employerAddress = employerAddress == null ? null : employerAddress.trim();
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation == null ? null : occupation.trim();
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry == null ? null : industry.trim();
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty == null ? null : duty.trim();
    }

    public String getTitleDw() {
        return titleDw;
    }

    public void setTitleDw(String titleDw) {
        this.titleDw = titleDw == null ? null : titleDw.trim();
    }

    public String getStartYear() {
        return startYear;
    }

    public void setStartYear(String startYear) {
        this.startYear = startYear == null ? null : startYear.trim();
    }

    public String getGetTime() {
        return getTime;
    }

    public void setGetTime(String getTime) {
        this.getTime = getTime;
    }
}