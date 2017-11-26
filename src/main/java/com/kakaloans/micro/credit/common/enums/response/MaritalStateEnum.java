package com.kakaloans.micro.credit.common.enums.response;

import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 婚姻状态枚举
 *
 * @author zhangjiawen
 * @version V1.0
 * @Title: MaritalStateEnum.java
 * @Package com.kakaloans.micro.credit.common.enums
 * @Description: 婚姻状态枚举
 * @date 2017年7月20日 下午6:45:03
 */
public enum MaritalStateEnum {
    YH("已婚", 0),
    WH("未婚", 1),
    LY1("离异", 2),
    LY2("离婚", 2),
    SO("丧偶", 3),
    WZ1("未知", 4),
    WZ2("--", 4),
    WZ3("——", 4),
    WZ4("", 4),
    WZ5(null, 4);


    public final String key;
    public final Integer value;

    MaritalStateEnum(String key, Integer value) {
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
        for (MaritalStateEnum em : values()) {
            if (key.equals(em.key)) {
                tName = em.value;
                break;
            }
        }
        return tName;
    }

    public static List<Map<String, Integer>> getWhole() {
        List<Map<String, Integer>> list = new ArrayList<Map<String, Integer>>();
        for (MaritalStateEnum em : values()) {
            Map<String, Integer> map = new HashMap<String, Integer>();
            map.put(em.key, em.value);
            list.add(map);
        }
        return list;
    }

}
