package com.kakaloans.micro.credit.common.enums.request;

import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 行业枚举
 *
 * @author zhangjiawen
 * @version V1.0
 * @Title: IndustryEnum.java
 * @Package com.kakaloans.micro.credit.common.enums.request
 * @Description: 行业枚举
 * @date 2017年7月20日 下午6:45:03
 */
public enum IndustryEnum {
    CJY("0", "采掘业"),
    DL("1", "电力、煤气及水的生产和供应业"),
    FDC("2", "房地产业"),
    GG("3", "公共管理和社会组织"),
    GJZZ("4", "国际组织"),
    JZY("5", "建筑业"),
    JTYS("6", "交通运输、仓储和邮政业"),
    JY("7", "教育"),
    JRY("8", "金融业"),
    JMFW("9", "居民服务和其他服务业"),
    KXYJ("10", "科学研究、技术服务业和地质勘察业"),
    NLMY("11", "农、林、牧、渔业"),
    PFLS("12", "批发和零售业"),
    SL("13", "水利、环境和公共设施管理业"),
    WS("14", "卫生、社会保障和社会福利业"),
    WH("15", "文化、体育和娱乐业"),
    XX("16", "信息传输、计算机服务和软件业"),
    ZZY("17", "制造业"),
    ZS("18", "住宿和餐饮业"),
    ZL("19", "租赁和商务服务业"),
    QT1("20", "其他"),
    WZ1("21", "未知");

    public final String key;
    public final String value;

    IndustryEnum(String key, String value) {
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
        for (IndustryEnum em : values()) {
            if (key.equals(em.key)) {
                tName = em.value;
                break;
            }
        }
        return tName;
    }

    public static List<Map<String, String>> getWhole() {
        List<Map<String, String>> list = new ArrayList<Map<String, String>>();
        for (IndustryEnum em : values()) {
            Map<String, String> map = new HashMap<String, String>();
            map.put(em.key, em.value);
            list.add(map);
        }
        return list;
    }
}
