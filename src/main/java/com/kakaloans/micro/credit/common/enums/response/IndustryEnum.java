package com.kakaloans.micro.credit.common.enums.response;

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
 * @Package com.kakaloans.micro.credit.common.enums
 * @Description: 行业枚举
 * @date 2017年7月20日 下午6:45:03
 */
public enum IndustryEnum {
    CJY("采掘业", 0),
    DL("电力、煤气及水的生产和供应业", 1),
    FDC("房地产业", 2),
    GG("公共管理和社会组织", 3),
    GJZZ("国际组织", 4),
    JZY("建筑业", 5),
    JTYS("交通运输、仓储和邮政业", 6),
    JY("教育", 7),
    JRY("金融业", 8),
    JMFW("居民服务和其他服务业", 9),
    KXYJ("科学研究、技术服务业和地质勘察业", 10),
    NLMY("农、林、牧、渔业", 11),
    PFLS("批发和零售业", 12),
    SL("水利、环境和公共设施管理业", 13),
    WS("卫生、社会保障和社会福利业", 14),
    WH("文化、体育和娱乐业", 15),
    XX("信息传输、计算机服务和软件业", 16),
    ZZY("制造业", 17),
    ZS("住宿和餐饮业", 18),
    ZL("租赁和商务服务业", 19),
    QT1("其他", 20),
    QT2("其它", 20),
    WZ1("未知", 21),
    WZ2("--", 21),
    WZ3("——", 21),
    WZ4("", 21),
    WZ5(null, 21);

    public final String key;
    public final Integer value;

    IndustryEnum(String key, Integer value) {
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
        for (IndustryEnum em : values()) {
            if (key.equals(em.key)) {
                tName = em.value;
                break;
            }
        }
        return tName;
    }

    public static List<Map<String, Integer>> getWhole() {
        List<Map<String, Integer>> list = new ArrayList<Map<String, Integer>>();
        for (IndustryEnum em : values()) {
            Map<String, Integer> map = new HashMap<String, Integer>();
            map.put(em.key, em.value);
            list.add(map);
        }
        return list;
    }
}
