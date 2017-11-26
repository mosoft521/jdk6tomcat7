package com.kakaloans.micro.credit.common.enums.request;

import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 账户币种类型枚举
 * <p>
 * 1-人民币
 * 2-美元
 * 3-欧元
 * 4-其它
 *
 * @author zhangjiawen
 * @version V1.0
 * @Title: CurrencyEnum.java
 * @Package com.kakaloans.micro.credit.common.enums.request
 * @Description: 账户币种类型枚举
 * @date 2017年7月20日 下午6:45:03
 */
public enum CurrencyEnum {
    RMB("1", "人民币"),
    MY("2", "美元"),
    OY("3", "欧元"),
    QT1("4", "其他");

    public final String key;
    public final String value;

    CurrencyEnum(String key, String value) {
        this.key = key;
        this.value = value;
    }

    /**
     * 通过编码可以获取对应的名称
     *
     * @param key
     * @return
     */
    public static String getValueByKey(String key) {
        if (StringUtils.isBlank(key)) {
            return null;
        }
        String tName = null;
        for (CurrencyEnum em : values()) {
            if (key.equals(em.key)) {
                tName = em.value;
                break;
            }
        }
        return tName;
    }

    public static List<Map<String, String>> getWhole() {
        List<Map<String, String>> list = new ArrayList<Map<String, String>>();
        for (CurrencyEnum em : values()) {
            Map<String, String> map = new HashMap<String, String>();
            map.put(em.key, em.value);
            list.add(map);
        }
        return list;
    }
}
