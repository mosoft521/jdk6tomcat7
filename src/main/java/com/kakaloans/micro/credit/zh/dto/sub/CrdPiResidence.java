package com.kakaloans.micro.credit.zh.dto.sub;

import com.google.gson.annotations.SerializedName;
import com.kakaloans.micro.credit.common.annotation.Desensitize;
import com.kakaloans.micro.credit.common.enums.ChannelResposeEnum;

public class CrdPiResidence {

    @SerializedName(value = "address")
    private String address;

    @SerializedName(value = "residenceType", alternate = "residencetype")
    @Desensitize(value = ChannelResposeEnum.ResidenceType)
    private String residenceType;

    @SerializedName(value = "getTime", alternate = "gettime")
    private String getTime;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getResidenceType() {
        return residenceType;
    }

    public void setResidenceType(String residenceType) {
        this.residenceType = residenceType == null ? null : residenceType.trim();
    }

    public String getGetTime() {
        return getTime;
    }

    public void setGetTime(String getTime) {
        this.getTime = getTime;
    }
}