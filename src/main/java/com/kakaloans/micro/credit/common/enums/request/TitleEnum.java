package com.kakaloans.micro.credit.common.enums.request;

import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 职称枚举
 *
 * @author zhangjiawen
 * @version V1.0
 * @Title: TitleEnum.java
 * @Package com.kakaloans.micro.credit.common.enums.request
 * @Description: 职称枚举
 * @date 2017年7月20日 下午6:45:03
 */
public enum TitleEnum {
    GJ("0", "高级"),
    ZJ("1", "中级"),
    CJ("2", "初级"),
    WU("3", "无"),
    WZ1("4", "未知");

    public final String key;
    public final String value;

    TitleEnum(String key, String value) {
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
        for (TitleEnum em : values()) {
            if (key.equals(em.key)) {
                tName = em.value;
                break;
            }
        }
        return tName;
    }

    public static List<Map<String, String>> getWhole() {
        List<Map<String, String>> list = new ArrayList<Map<String, String>>();
        for (TitleEnum em : values()) {
            Map<String, String> map = new HashMap<String, String>();
            map.put(em.key, em.value);
            list.add(map);
        }
        return list;
    }
}
