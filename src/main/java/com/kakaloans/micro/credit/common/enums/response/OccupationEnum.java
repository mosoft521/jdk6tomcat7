package com.kakaloans.micro.credit.common.enums.response;

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
 * @Package com.kakaloans.micro.credit.common.enums
 * @Description: 职业枚举
 * @date 2017年7月20日 下午6:45:03
 */
public enum OccupationEnum {
    FZR("国家机关、党群组织、企业、事业单位负责人", 0),
    ZYJSRY("专业技术人员", 1),
    BSRY("办事人员和有关人员", 3),
    SYFWYRY("商业、服务业人员", 4),
    NLMYS("农、林、牧、渔、水利业生产人员", 5),
    SCYS("生产、运输设备操作人员及有关人员", 6),
    JR("军人", 7),
    QT1("不便分类的其他从业人员", 8),
    QT2("不便分类的其它从业人员", 8),
    WZ1("未知", 9),
    WZ2("--", 9),
    WZ3("——", 9),
    WZ4("", 9),
    WZ5(null, 9);

    public final String key;
    public final Integer value;

    OccupationEnum(String key, Integer value) {
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
        for (OccupationEnum em : values()) {
            if (key.equals(em.key)) {
                tName = em.value;
                break;
            }
        }
        return tName;
    }

    public static List<Map<String, Integer>> getWhole() {
        List<Map<String, Integer>> list = new ArrayList<Map<String, Integer>>();
        for (OccupationEnum em : values()) {
            Map<String, Integer> map = new HashMap<String, Integer>();
            map.put(em.key, em.value);
            list.add(map);
        }
        return list;
    }
}
