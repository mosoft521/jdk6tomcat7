package com.kakaloans.micro.credit.common.enums.request;

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
 * @Package com.kakaloans.micro.credit.common.enums.request
 * @Description: 21档数值枚举
 * @date 2017年7月20日 下午6:45:03
 */
public enum TwentyOneGradeEnum {
    ZERO(0, "0"),
    ONE(1, "1"),
    TWO(2, "3"),
    THREE(3, "5"),
    FOUR(4, "7"),
    FIVE(5, "10"),
    SIX(6, "13"),
    SEVEN(7, "19"),
    EIGHT(8, "25"),
    NINE(9, "31"),
    TEN(10, "37"),
    GRADE11(11, "49"),
    GRADE12(12, "61"),
    GRADE13(13, "73"),
    GRADE14(14, "85"),
    GRADE15(15, "97"),
    GRADE16(16, "109"),
    GRADE17(17, "121"),
    GRADE18(18, "133"),
    GRADE19(19, "157"),
    GRADE20(20, "181");

    public final Integer key;
    public final String value;

    TwentyOneGradeEnum(Integer key, String value) {
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
    public static String getValueByKey(String key) {
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
    public static String getValueByKeyDouble(Double key) {
        String prev = "0";
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

    public static List<Map<Integer, String>> getWhole() {
        List<Map<Integer, String>> list = new ArrayList<Map<Integer, String>>();
        for (TwentyOneGradeEnum em : values()) {
            Map<Integer, String> map = new HashMap<Integer, String>();
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
//        System.out.println(TwentyOneGradeEnum.getValueByKey("20"));
//        System.out.println(TwentyOneGradeEnum.getValueByKey("800"));
//    }
}
