package com.kakaloans.micro.credit.common.enums.response;


public enum ZYXJResponseOptResultEnum {
    ACCEPT("0", "接受"),
    REFUSE("1", "拒绝");

    public final String status;
    public final String desc;

    private ZYXJResponseOptResultEnum(String status, String desc) {
        this.status = status;
        this.desc = desc;
    }
}
