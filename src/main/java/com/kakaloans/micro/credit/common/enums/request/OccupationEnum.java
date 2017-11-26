package com.kakaloans.micro.credit.common.enums.request;

import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 职业枚举
 *
 * @author zhangjiawen
 * @version V1.0
 * @Title: OccupationEnum.java
 * @Package com.kakaloans.micro.credit.common.enums.request
 * @Description: 职业枚举
 * @date 2017年7月20日 下午6:45:03
 */
public enum OccupationEnum {
    FZR("0", "国家机关、党群组织、企业、事业单位负责人"),
    ZYJSRY("1", "专业技术人员"),
    BSRY("3", "办事人员和有关人员"),
    SYFWYRY("4", "商业、服务业人员"),
    NLMYS("5", "农、林、牧、渔、水利业生产人员"),
    SCYS("6", "生产、运输设备操作人员及有关人员"),
    JR("7", "军人"),
    QT1("8", "不便分类的其他从业人员"),
    WZ1("9", "未知");

    public final String key;
    public final String value;

    OccupationEnum(String key, String value) {
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
        for (OccupationEnum em : values()) {
            if (key.equals(em.key)) {
                tName = em.value;
                break;
            }
        }
        return tName;
    }

    public static List<Map<String, String>> getWhole() {
        List<Map<String, String>> list = new ArrayList<Map<String, String>>();
        for (OccupationEnum em : values()) {
            Map<String, String> map = new HashMap<String, String>();
            map.put(em.key, em.value);
            list.add(map);
        }
        return list;
    }
}
