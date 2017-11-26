package com.kakaloans.micro.credit.common.enums;

import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 中原消金脱敏枚举类
 *
 * @author zhangjiawen
 * @version V1.0
 * @Title: ZhongyuanResposeEnum.java
 * @Package com.kakaloans.micro.credit.common.util
 * @Description: ZhongyuanResposeEnum Enum
 * @date 2017年7月20日 下午6:45:03
 */
public enum ChannelResposeEnum {
    MaritalState("MaritalState", "MaritalStateEnum"),//婚姻状况
    EduLevel("Edulevel", "EduLevelEnum"),//学历
    Edudegree("Edudegree", "EduDegreeEnum"),//学位
    ResidenceType("ResidenceType", "ResidenceTypeEnum"),//居住状况枚举
    Occupation("Occupation", "OccupationEnum"),//职业
    Industry("Industry", "IndustryEnum"),//行业
    Duty("Duty", "DutyEnum"),//职务
    Title("Title", "TitleEnum"),//职称
    FiveGrade("FiveGrade", "FiveGradeEnum"),//5档数值枚举
    SixGrade("SixGrade", "SixGradeEnum"),//6档数值枚举
    ElevenGrade("ElevenGrade", "ElevenGradeEnum"),//11级数值枚举
    ElevenGrade2("ElevenGrade2", "ElevenGrade2Enum"),//11级数值枚举2
    TwentyOneGrade("TwentyOneGrade", "TwentyOneGradeEnum"),//20级数值枚举
    BigPercentageGrade("BigPercentageGrade", "BigPercentageGradeEnum"),//按百分制记枚举（大金额）
    SmallPercentageGrade("SmallPercentageGrade", "SmallPercentageGradeEnum"),//按百分制记枚举（小金额）
    GuaranteeType("GuaranteeType", "GuaranteeTypeEnum"),//担保方式枚举
    Currency("Currency", "CurrencyEnum"),//账户币种类型枚举
    Gender("Gender", "GenderEnum");//性别类型枚举

    public final String key;

    public final String value;

    ChannelResposeEnum(String key, String value) {
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
        String tName = null;
        if (StringUtils.isNotBlank(key)) {
            for (ChannelResposeEnum em : values()) {
                if (key.equals(em.key)) {
                    tName = em.value;
                    break;
                }
            }
        }
        return tName;
    }

    public static List<Map<String, String>> getWhole() {
        List<Map<String, String>> list = new ArrayList<Map<String, String>>();
        for (ChannelResposeEnum em : values()) {
            Map<String, String> map = new HashMap<String, String>();
            map.put("key", em.key);
            map.put("value", em.value);
            list.add(map);
        }
        return list;
    }

    public static Map<String, String> getWholeMap() {
        Map<String, String> map = new HashMap<String, String>();
        for (ChannelResposeEnum em : values()) {
            map.put(em.key, em.value);
        }
        return map;
    }
}
