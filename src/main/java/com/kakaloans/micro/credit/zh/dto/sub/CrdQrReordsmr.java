package com.kakaloans.micro.credit.zh.dto.sub;

import com.kakaloans.micro.credit.common.annotation.Desensitize;
import com.kakaloans.micro.credit.common.enums.ChannelResposeEnum;

public class CrdQrReordsmr {

    @Desensitize(value = ChannelResposeEnum.FiveGrade)
    private String lastmonthorgloanapprove;
    @Desensitize(value = ChannelResposeEnum.FiveGrade)
    private String lastmonthorgcardapprove;
    @Desensitize(value = ChannelResposeEnum.FiveGrade)
    private String lastmonthqueryloanapprove;
    @Desensitize(value = ChannelResposeEnum.FiveGrade)
    private String lastmonthquerycardapprove;
    @Desensitize(value = ChannelResposeEnum.FiveGrade)
    private String lastmonthqueryselfquery;
    @Desensitize(value = ChannelResposeEnum.FiveGrade)
    private String last2YEARQUERYLOANMANAGE;
    @Desensitize(value = ChannelResposeEnum.FiveGrade)
    private String last2YEARQUERYGUARANTEE;
    @Desensitize(value = ChannelResposeEnum.FiveGrade)
    private String last2YEARQUERYREALCOMMER;

    public String getLastmonthorgloanapprove() {
        return lastmonthorgloanapprove;
    }

    public void setLastmonthorgloanapprove(String lastmonthorgloanapprove) {
        this.lastmonthorgloanapprove = lastmonthorgloanapprove;
    }

    public String getLastmonthorgcardapprove() {
        return lastmonthorgcardapprove;
    }

    public void setLastmonthorgcardapprove(String lastmonthorgcardapprove) {
        this.lastmonthorgcardapprove = lastmonthorgcardapprove;
    }

    public String getLastmonthqueryloanapprove() {
        return lastmonthqueryloanapprove;
    }

    public void setLastmonthqueryloanapprove(String lastmonthqueryloanapprove) {
        this.lastmonthqueryloanapprove = lastmonthqueryloanapprove;
    }

    public String getLastmonthquerycardapprove() {
        return lastmonthquerycardapprove;
    }

    public void setLastmonthquerycardapprove(String lastmonthquerycardapprove) {
        this.lastmonthquerycardapprove = lastmonthquerycardapprove;
    }

    public String getLastmonthqueryselfquery() {
        return lastmonthqueryselfquery;
    }

    public void setLastmonthqueryselfquery(String lastmonthqueryselfquery) {
        this.lastmonthqueryselfquery = lastmonthqueryselfquery;
    }

    public String getLast2YEARQUERYLOANMANAGE() {
        return last2YEARQUERYLOANMANAGE;
    }

    public void setLast2YEARQUERYLOANMANAGE(String last2yearqueryloanmanage) {
        last2YEARQUERYLOANMANAGE = last2yearqueryloanmanage;
    }

    public String getLast2YEARQUERYGUARANTEE() {
        return last2YEARQUERYGUARANTEE;
    }

    public void setLast2YEARQUERYGUARANTEE(String last2yearqueryguarantee) {
        last2YEARQUERYGUARANTEE = last2yearqueryguarantee;
    }

    public String getLast2YEARQUERYREALCOMMER() {
        return last2YEARQUERYREALCOMMER;
    }

    public void setLast2YEARQUERYREALCOMMER(String last2yearqueryrealcommer) {
        last2YEARQUERYREALCOMMER = last2yearqueryrealcommer;
    }


}