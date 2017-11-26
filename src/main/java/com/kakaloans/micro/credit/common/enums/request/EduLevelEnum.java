package com.kakaloans.micro.credit.common.enums.request;

import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 学历枚举
 *
 * @author zhangjiawen
 * @version V1.0
 * @Title: EdulevelEnum.java
 * @Package com.kakaloans.micro.credit.common.enums.request
 * @Description: 学历枚举
 * @date 2017年7月20日 下午6:45:03
 */
public enum EduLevelEnum {
    YJS("0", "研究生"),
    DX5("1", "大学本科（简称\"大学\"）"),
    DZ5("2", "大学专科和专科学校（简称\"大专\"）"),
    ZZ("3", "中等专业学校或中等技术学校"),
    JX("4", "技术学校"),
    GZ("5", "高中"),
    CZ("6", "初中"),
    XX("7", "小学"),
    WMHBWM("8", "文盲或半文盲"),
    QT1("9", "其他"),
    WZ1("10", "未知");

    public final String key;
    public final String value;

    EduLevelEnum(String key, String value) {
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
        for (EduLevelEnum em : values()) {
            if (key.equals(em.key)) {
                tName = em.value;
                break;
            }
        }
        return tName;
    }

    public static List<Map<String, String>> getWhole() {
        List<Map<String, String>> list = new ArrayList<Map<String, String>>();
        for (EduLevelEnum em : values()) {
            Map<String, String> map = new HashMap<String, String>();
            map.put(em.key, em.value);
            list.add(map);
        }
        return list;
    }
}
