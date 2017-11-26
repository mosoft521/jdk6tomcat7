package com.kakaloans.micro.credit.zh.dto.sub;


import com.google.gson.annotations.SerializedName;
import com.kakaloans.micro.credit.common.annotation.Desensitize;
import com.kakaloans.micro.credit.common.enums.ChannelResposeEnum;

public class CrdPiIdentity {

    @SerializedName(value = "gender")
    @Desensitize(value = ChannelResposeEnum.Gender)
    private String gender;

    @SerializedName(value = "maritalState", alternate = "maritalstste")
    private String maritalState;

    @SerializedName(value = "officeTelephoneNo", alternate = "officetelephoneno")
    private String officeTelephoneNo;

    @SerializedName(value = "homeTelephoneNo", alternate = "hometelephoneno")
    private String homeTelephoneNo;

    @SerializedName(value = "eduLevel", alternate = "edulevel")
    @Desensitize(value = ChannelResposeEnum.EduLevel)
    private String eduLevel;

    @SerializedName(value = "eduDegree", alternate = "edudegree")
    @Desensitize(value = ChannelResposeEnum.Edudegree)
    private String eduDegree;

    @SerializedName(value = "postAddress", alternate = "postaddress")
    private String postAddress;

    @SerializedName(value = "registeredAddress", alternate = "registeredaddress")
    private String registeredAddress;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMaritalState() {
        return maritalState;
    }

    public void setMaritalState(String maritalState) {
        this.maritalState = maritalState;
    }

    public String getOfficeTelephoneNo() {
        return officeTelephoneNo;
    }

    public void setOfficeTelephoneNo(String officeTelephoneNo) {
        this.officeTelephoneNo = officeTelephoneNo;
    }

    public String getHomeTelephoneNo() {
        return homeTelephoneNo;
    }

    public void setHomeTelephoneNo(String homeTelephoneNo) {
        this.homeTelephoneNo = homeTelephoneNo;
    }

    public String getEduLevel() {
        return eduLevel;
    }

    public void setEduLevel(String eduLevel) {
        this.eduLevel = eduLevel;
    }

    public String getEduDegree() {
        return eduDegree;
    }

    public void setEduDegree(String eduDegree) {
        this.eduDegree = eduDegree;
    }

    public String getPostAddress() {
        return postAddress;
    }

    public void setPostAddress(String postAddress) {
        this.postAddress = postAddress;
    }

    public String getRegisteredAddress() {
        return registeredAddress;
    }

    public void setRegisteredAddress(String registeredAddress) {
        this.registeredAddress = registeredAddress;
    }


}