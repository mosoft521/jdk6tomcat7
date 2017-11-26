package com.kakaloans.micro.credit.common.enums.response;

import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 职务枚举
 *
 * @author zhangjiawen
 * @version V1.0
 * @Title: DutyEnum.java
 * @Package com.kakaloans.micro.credit.common.enums
 * @Description: 职务枚举
 * @date 2017年7月20日 下午6:45:03
 */
public enum DutyEnum {
    JJYS("高级领导(行政级别局级及局级以上领导或大公司高级管理人员)", 0),
    JJYS2("高级领导（行政级别局级及局级以上领导或大公司高级管理人员）", 0),
    GJLD("高级领导", 0),
    JJYX("中级领导(行政级别局级以下领导或大公司中级管理人员)", 1),
    JJYX2("中级领导（行政级别局级以下领导或大公司中级管理人员）", 1),
    ZJLD("中级领导", 1),
    YBYG("一般员工", 2),
    QT("其他", 3),
    QT2("其它", 3),
    WZ1("未知", 4),
    WZ2("--", 4),
    WZ3("——", 4),
    WZ4("", 4),
    WZ5(null, 4);

    public final String key;
    public final Integer value;

    DutyEnum(String key, Integer value) {
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
        for (DutyEnum em : values()) {
            if (key.equals(em.key)) {
                tName = em.value;
                break;
            }
        }
        return tName;
    }

    public static List<Map<String, Integer>> getWhole() {
        List<Map<String, Integer>> list = new ArrayList<Map<String, Integer>>();
        for (DutyEnum em : values()) {
            Map<String, Integer> map = new HashMap<String, Integer>();
            map.put(em.key, em.value);
            list.add(map);
        }
        return list;
    }
}
