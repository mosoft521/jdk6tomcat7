package com.kakaloans.micro.credit.common.enums.response;

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
 * @Package com.kakaloans.micro.credit.common.enums
 * @Description: 学历枚举
 * @date 2017年7月20日 下午6:45:03
 */
public enum EduLevelEnum {
    YJS("研究生", 0),
    DX1("大学本科（简称\"大学\"）", 1),
    DX12("大学本科(简称\"大学\")", 1),
    DX2("大学本科", 1),
    DX3("大学", 1),
    DX4("大本", 1),
    DX5("本科", 1),
    DZ1("大学专科和专科学校（简称\"大专\"）", 2),
    DZ12("大学专科和专科学校(简称\"大专\")", 2),
    DZ2("大学专科和专科学校", 2),
    DZ3("大学专科", 2),
    DZ4("专科学校", 2),
    DZ5("大专", 2),
    ZDZYXXHZDJSXX("中等专业学校或中等技术学校", 3),
    ZDZYXX("中等专业学校", 3),
    ZDJSXX("中等技术学校", 3),
    ZZ("中专", 3),
    JSXX("技术学校", 4),
    JX("技校", 4),
    GZ("高中", 5),
    CZ("初中", 6),
    XX("小学", 7),
    WMHBWM("文盲或半文盲", 8),
    WM("文盲", 8),
    BWM("半文盲", 8),
    QT1("其它", 9),
    QT2("其他", 9),
    WZ1("未知", 10),
    WZ2("--", 10),
    WZ3("——", 10),
    WZ4("", 10),
    WZ5(null, 10);

    public final String key;
    public final Integer value;

    EduLevelEnum(String key, Integer value) {
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
        for (EduLevelEnum em : values()) {
            if (key.equals(em.key)) {
                tName = em.value;
                break;
            }
        }
        return tName;
    }

    public static List<Map<String, Integer>> getWhole() {
        List<Map<String, Integer>> list = new ArrayList<Map<String, Integer>>();
        for (EduLevelEnum em : values()) {
            Map<String, Integer> map = new HashMap<String, Integer>();
            map.put(em.key, em.value);
            list.add(map);
        }
        return list;
    }
}
