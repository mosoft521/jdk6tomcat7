package com.kakaloans.micro.credit.common.enums.request;

import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 担保方式枚举
 * <p>
 * 1－质押（含保证金）
 * 2－抵押
 * 3－保证
 * 4－信用/免担保
 * 5－组合（含保证）
 * 6－组合（不含保证）
 * 7－农户联保
 * 8－其他
 *
 * @author zhangjiawen
 * @version V1.0
 * @Title: GuaranteeTypeEnum.java
 * @Package com.kakaloans.micro.credit.common.enums.request
 * @Description: 担保方式枚举
 * @date 2017年7月20日 下午6:45:03
 */
public enum GuaranteeTypeEnum {
    ZYHBZJ22("1", "质押（含保证金）"),
    DY2("2", "抵押"),
    BZ2("3", "保证"),
    XYMDB("4", "信用/免担保"),
    ZHHBZ22("5", "组合（含保证）"),
    ZHBHBZ22("6", "组合（不含保证）"),
    NHLB2("7", "农户联保"),
    WZ2("8", "其他");

    public final String key;
    public final String value;

    GuaranteeTypeEnum(String key, String value) {
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
        for (GuaranteeTypeEnum em : values()) {
            if (key.equals(em.key)) {
                tName = em.value;
                break;
            }
        }
        return tName;
    }

    public static List<Map<String, String>> getWhole() {
        List<Map<String, String>> list = new ArrayList<Map<String, String>>();
        for (GuaranteeTypeEnum em : values()) {
            Map<String, String> map = new HashMap<String, String>();
            map.put(em.key, em.value);
            list.add(map);
        }
        return list;
    }
}
