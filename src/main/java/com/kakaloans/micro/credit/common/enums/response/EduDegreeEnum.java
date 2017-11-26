package com.kakaloans.micro.credit.common.enums.response;

import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 学位枚举
 *
 * @author zhangjiawen
 * @version V1.0
 * @Title: EduDegreeEnum.java
 * @Package com.kakaloans.micro.credit.common.enums
 * @Description: 学位枚举
 * @date 2017年7月20日 下午6:45:03
 */
public enum EduDegreeEnum {
    BS("博士", 0),
    MYBS("名誉博士", 1),
    SS("硕士", 2),
    XS("学士", 3),
    QT("其他", 4),
    QT2("其它", 4),
    WZ1("未知", 5),
    WZ2("--", 5),
    WZ3("——", 5),
    WZ4("", 5),
    WZ5(null, 5);

    public final String key;
    public final Integer value;

    EduDegreeEnum(String key, Integer value) {
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
        for (EduDegreeEnum em : values()) {
            if (key.equals(em.key)) {
                tName = em.value;
                break;
            }
        }
        return tName;
    }

    public static List<Map<String, Integer>> getWhole() {
        List<Map<String, Integer>> list = new ArrayList<Map<String, Integer>>();
        for (EduDegreeEnum em : values()) {
            Map<String, Integer> map = new HashMap<String, Integer>();
            map.put(em.key, em.value);
            list.add(map);
        }
        return list;
    }
}
