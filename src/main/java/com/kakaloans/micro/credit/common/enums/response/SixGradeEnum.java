package com.kakaloans.micro.credit.common.enums.response;

import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 6档数值枚举
 * 取值区间：
 * 0，赋值0
 * 1-2，赋值1
 * 3-4，赋值2
 * 5-7，赋值3
 * 8-10，赋值4
 * 10+，赋值5
 *
 * @author zhangjiawen
 * @version V1.0
 * @Title: FiveGradeEnum.java
 * @Package com.kakaloans.micro.credit.common.enums
 * @Description: 6档数值枚举
 * @date 2017年7月20日 下午6:45:03
 */
public enum SixGradeEnum {
    ZERO(0, 0),
    ONE(1, 1),
    TWO(3, 2),
    THREE(5, 3),
    FOUR(8, 4),
    FIVE(11, 5);

    public final Integer key;
    public final Integer value;

    SixGradeEnum(Integer key, Integer value) {
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
        for (SixGradeEnum em : values()) {
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
        for (SixGradeEnum em : values()) {
            Map<Integer, Integer> map = new HashMap<Integer, Integer>();
            map.put(em.key, em.value);
            list.add(map);
        }
        return list;
    }

//    //测试
//    public static void main(String[] args) {
//        System.out.println(SixGradeGradeEnum.getValueByKey("0"));
//        System.out.println(SixGradeGradeEnum.getValueByKey("1"));
//        System.out.println(SixGradeGradeEnum.getValueByKey("1.5"));
//        System.out.println(SixGradeGradeEnum.getValueByKey("3"));
//        System.out.println(SixGradeGradeEnum.getValueByKey("3.5"));
//        System.out.println(SixGradeGradeEnum.getValueByKey("8"));
//    }
}
