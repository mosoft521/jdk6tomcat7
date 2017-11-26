package com.kakaloans.micro.credit.common.enums.request;

public enum StatusEnum {
    QUERYING0(0, "查询"),
    QUERYING1(1, "查询中"),
    QUERY_SUCCESS_HAS_REPORT(2, "查询成功有报告"),
    QUERY_SUCCESS_NO_REPORT(3, "查询成功无报告");
    public Integer key;
    public String value;

    StatusEnum(Integer key, String value) {
        this.key = key;
        this.value = value;
    }

    public static String getValueByKey(Integer key) {
        String value = null;
        for (StatusEnum statusEnum : values()) {
            if (key.equals(statusEnum.key)) {
                value = statusEnum.value;
                break;
            }
        }
        return value;
    }

}
