package com.kakaloans.micro.credit.common.enums.response;

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
 * @Package com.kakaloans.micro.credit.common.enums
 * @Description: 账户币种类型枚举
 * @date 2017年7月20日 下午6:45:03
 */
public enum CurrencyEnum {
    RMB("人民币", 1),
    MY("美元", 2),
    OY("欧元", 3),
    QT1("其他", 4),
    QT2("其它", 4),
    QT3("--", 4),
    QT4("——", 4),
    QT5("", 4),
    QT6(null, 4);

    public final String key;
    public final Integer value;

    CurrencyEnum(String key, Integer value) {
        this.key = key;
        this.value = value;
    }

    /**
     * 通过编码可以获取对应的名称
     *
     * @param key
     * @return
     */
    public static Integer getValueByKey(String key) {
        if (StringUtils.isBlank(key)) {
            return null;
        }
        Integer tName = null;
        for (CurrencyEnum em : values()) {
            if (key.equals(em.key)) {
                tName = em.value;
                break;
            }
        }
        return tName;
    }

    public static List<Map<String, Integer>> getWhole() {
        List<Map<String, Integer>> list = new ArrayList<Map<String, Integer>>();
        for (CurrencyEnum em : values()) {
            Map<String, Integer> map = new HashMap<String, Integer>();
            map.put(em.key, em.value);
            list.add(map);
        }
        return list;
    }
}
