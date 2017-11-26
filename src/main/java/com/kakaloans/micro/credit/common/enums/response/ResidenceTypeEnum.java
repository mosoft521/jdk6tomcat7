package com.kakaloans.micro.credit.common.enums.response;

import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 居住状况枚举
 *
 * @author zhangjiawen
 * @version V1.0
 * @Title: ResidenceTypeEnum.java
 * @Package com.kakaloans.micro.credit.common.enums
 * @Description: 居住状况枚举
 * @date 2017年7月20日 下午6:45:03
 */
public enum ResidenceTypeEnum {
    AJ("按揭", 0),
    GYZZ("共有住宅", 1),
    JTSS("集体宿舍", 2),
    QSLY("亲属楼宇", 3),
    ZZ("自置", 4),
    ZF("租房", 5),
    QT1("其他", 6),
    QT2("其它", 6),
    WZ1("未知", 7),
    WZ2("--", 7),
    WZ3("——", 7),
    WZ4("", 7),
    WZ5(null, 7);

    public final String key;
    public final Integer value;

    ResidenceTypeEnum(String key, Integer value) {
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
        for (ResidenceTypeEnum em : values()) {
            if (key.equals(em.key)) {
                tName = em.value;
                break;
            }
        }
        return tName;
    }

    public static List<Map<String, Integer>> getWhole() {
        List<Map<String, Integer>> list = new ArrayList<Map<String, Integer>>();
        for (ResidenceTypeEnum em : values()) {
            Map<String, Integer> map = new HashMap<String, Integer>();
            map.put(em.key, em.value);
            list.add(map);
        }
        return list;
    }
}
