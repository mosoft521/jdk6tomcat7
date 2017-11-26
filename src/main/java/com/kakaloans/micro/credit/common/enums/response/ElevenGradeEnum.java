package com.kakaloans.micro.credit.common.enums.response;

import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 11级数值枚举
 * 取值区间：
 * 0，赋值0
 * [1-2)，赋值1
 * [2-3)，赋值2
 * [3-4)，赋值3
 * [4-5)，赋值4
 * [5-6)，赋值5
 * [6-7)，赋值6
 * [7-8)，赋值7
 * [8-9)，赋值8
 * [9-10)，赋值9
 * 10+，赋值10
 *
 * @author zhangjiawen
 * @version V1.0
 * @Title: TenGradeEnum.java
 * @Package com.kakaloans.micro.credit.common.enums
 * @Description: 11级数值枚举
 * @date 2017年7月20日 下午6:45:03
 */
public enum ElevenGradeEnum {
    ZERO(0, 0),
    ONE(1, 1),
    TWO(2, 2),
    THREE(3, 3),
    FOUR(4, 4),
    FIVE(5, 5),
    SIX(6, 6),
    SEVEN(7, 7),
    EIGHT(8, 8),
    NINE(9, 9),
    TEN(10, 10);

    public final Integer key;
    public final Integer value;

    ElevenGradeEnum(Integer key, Integer value) {
        this.key = key;
        this.value = value;
    }

    /**
     * 通过编码可以获取对应的名称
     * 特别处理
     *
     * @param key
     * @return
     */
    public static Integer getValueByKey(String key) {
        if (StringUtils.isBlank(key)) {
            return null;
        }
        return getValueByKeyDouble(Double.valueOf(key));
    }

    /**
     * 通过编码可以获取对应的名称
     * 特别处理
     * [)
     *
     * @param key
     * @return
     */
    public static Integer getValueByKeyDouble(Double key) {
        Integer prev = 0;
        for (ElevenGradeEnum em : values()) {
            if (key.intValue() < em.key.intValue()) {
                return prev;
            } else if (key.intValue() == em.key.intValue()) {
                return em.value;
            } else {
                prev = em.value;
            }
        }
        return prev;
    }

    public static List<Map<Integer, Integer>> getWhole() {
        List<Map<Integer, Integer>> list = new ArrayList<Map<Integer, Integer>>();
        for (ElevenGradeEnum em : values()) {
            Map<Integer, Integer> map = new HashMap<Integer, Integer>();
            map.put(em.key, em.value);
            list.add(map);
        }
        return list;
    }

//    //测试
//    public static void main(String[] args) {
//        System.out.println(ElevenGradeEnum.getValueByKey("0"));
//        System.out.println(ElevenGradeEnum.getValueByKey("1"));
//        System.out.println(ElevenGradeEnum.getValueByKey("4.5"));
//        System.out.println(ElevenGradeEnum.getValueByKey("8"));
//        System.out.println(ElevenGradeEnum.getValueByKey("12"));
//    }
}
