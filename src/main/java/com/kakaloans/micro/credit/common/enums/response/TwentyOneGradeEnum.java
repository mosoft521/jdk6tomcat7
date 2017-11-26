package com.kakaloans.micro.credit.common.enums.response;

import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 21档数值枚举
 * 取值区间：
 * 0，赋值0
 * 1-2，赋值1
 * 3-4，赋值2
 * 5-6，赋值3
 * 7-9，赋值4
 * 10-12，赋值5
 * 13-18，赋值6
 * 19-24，赋值7
 * 25-30，赋值8
 * 31-36，赋值9
 * 37-48，赋值10
 * 49-60，赋值11
 * 61-72，赋值12
 * 73-84，赋值13
 * 85-96，赋值14
 * 97-108，赋值15
 * 109-120，赋值16
 * 121-132，赋值17
 * 133-156，赋值18
 * 157-180，赋值19
 * 181，赋值20
 *
 * @author zhangjiawen
 * @version V1.0
 * @Title: TwentyOneGradeEnum.java
 * @Package com.kakaloans.micro.credit.common.enums
 * @Description: 21档数值枚举
 * @date 2017年7月20日 下午6:45:03
 */
public enum TwentyOneGradeEnum {
    ZERO(0, 0),
    ONE(1, 1),
    TWO(3, 2),
    THREE(5, 3),
    FOUR(7, 4),
    FIVE(10, 5),
    SIX(13, 6),
    SEVEN(19, 7),
    EIGHT(25, 8),
    NINE(31, 9),
    TEN(37, 10),
    GRADE11(49, 11),
    GRADE12(61, 12),
    GRADE13(73, 13),
    GRADE14(85, 14),
    GRADE15(97, 15),
    GRADE16(109, 16),
    GRADE17(121, 17),
    GRADE18(133, 18),
    GRADE19(157, 19),
    GRADE20(181, 20);

    public final Integer key;
    public final Integer value;

    TwentyOneGradeEnum(Integer key, Integer value) {
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
        for (TwentyOneGradeEnum em : values()) {
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
        for (TwentyOneGradeEnum em : values()) {
            Map<Integer, Integer> map = new HashMap<Integer, Integer>();
            map.put(em.key, em.value);
            list.add(map);
        }
        return list;
    }

//    //测试
//    public static void main(String[] args) {
//        System.out.println(TwentyOneGradeEnum.getValueByKey("0"));
//        System.out.println(TwentyOneGradeEnum.getValueByKey("1"));
//        System.out.println(TwentyOneGradeEnum.getValueByKey("1.5"));
//        System.out.println(TwentyOneGradeEnum.getValueByKey("3"));
//        System.out.println(TwentyOneGradeEnum.getValueByKey("3.5"));
//        System.out.println(TwentyOneGradeEnum.getValueByKey("8"));
//        System.out.println(TwentyOneGradeEnum.getValueByKey("80"));
//        System.out.println(TwentyOneGradeEnum.getValueByKey("800"));
//    }
}
