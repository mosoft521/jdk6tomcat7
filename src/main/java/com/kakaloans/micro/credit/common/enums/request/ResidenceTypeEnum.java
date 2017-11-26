package com.kakaloans.micro.credit.common.enums.request;

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
 * @Package com.kakaloans.micro.credit.common.enums.request
 * @Description: 居住状况枚举
 * @date 2017年7月20日 下午6:45:03
 */
public enum ResidenceTypeEnum {
    AJ("0", "按揭"),
    GYZZ("1", "共有住宅"),
    JTSS("2", "集体宿舍"),
    QSLY("3", "亲属楼宇"),
    ZZ("4", "自置"),
    ZF("5", "租房"),
    QT1("6", "其他"),
    WZ1("7", "未知");

    public final String key;
    public final String value;

    ResidenceTypeEnum(String key, String value) {
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
        for (ResidenceTypeEnum em : values()) {
            if (key.equals(em.key)) {
                tName = em.value;
                break;
            }
        }
        return tName;
    }

    public static List<Map<String, String>> getWhole() {
        List<Map<String, String>> list = new ArrayList<Map<String, String>>();
        for (ResidenceTypeEnum em : values()) {
            Map<String, String> map = new HashMap<String, String>();
            map.put(em.key, em.value);
            list.add(map);
        }
        return list;
    }
}
