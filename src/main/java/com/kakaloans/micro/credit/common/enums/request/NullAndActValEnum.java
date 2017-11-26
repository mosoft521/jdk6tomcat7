package com.kakaloans.micro.credit.common.enums.request;

import org.apache.commons.lang.StringUtils;

public enum NullAndActValEnum {

    ZERO(0, "0");

    public final Integer key;
    public final String value;

    NullAndActValEnum(Integer key, String value) {
        this.key = key;
        this.value = value;
    }

    public static String getValueByKey(String key) {
        if (StringUtils.isBlank(key)) {
            return null;
        }
        return key;
    }

    //测试
    public static void main(String[] args) {
        System.out.println(NullAndActValEnum.getValueByKey(""));
        System.out.println(NullAndActValEnum.getValueByKey("0"));
        System.out.println(NullAndActValEnum.getValueByKey("1"));
    }
}
