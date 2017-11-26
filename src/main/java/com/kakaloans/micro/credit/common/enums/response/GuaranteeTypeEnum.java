package com.kakaloans.micro.credit.common.enums.response;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 担保方式枚举
 * <p>
 * 1－质押（含保证金）
 * 2－抵押
 * 3－保证
 * 4－信用/免担保
 * 5－组合（含保证）
 * 6－组合（不含保证）
 * 7－农户联保
 * 8－其他
 *
 * @author zhangjiawen
 * @version V1.0
 * @Title: GuaranteeTypeEnum.java
 * @Package com.kakaloans.micro.credit.common.enums
 * @Description: 担保方式枚举
 * @date 2017年7月20日 下午6:45:03
 */
public enum GuaranteeTypeEnum {
    ZYHBZJ("质押（含保证金）", 1),
    ZYHBZJ11("质押(含保证金)", 1),
    ZYHBZJ2("质押（含保证金）担保", 1),
    ZYHBZJ22("质押(含保证金)担保", 1),
    ZY("质押", 1),
    ZY2("质押担保", 1),
    DY("抵押", 2),
    DY2("抵押担保", 2),
    BZ("保证", 3),
    BZ2("保证担保", 3),
    XYMDB("信用/免担保", 4),
    XYMDB2("信用免担保", 4),
    XY("信用", 4),
    XY2("信用担保", 4),
    MDB("免担保", 4),
    ZHHBZ("组合（含保证）", 5),
    ZHHBZ11("组合(含保证)", 5),
    ZHHBZ2("组合（含保证）担保", 5),
    ZHHBZ22("组合(含保证)担保", 5),
    ZHBHBZ("组合（不含保证）", 6),
    ZHBHBZ11("组合(不含保证)", 6),
    ZHBHBZ2("组合（不含保证）担保", 6),
    ZHBHBZ22("组合(不含保证)担保", 6),
    NHLB("农户联保", 7),
    NHLB2("农户联保担保", 7),
    WZ1("其他", 8),
    WZ2("其他担保", 8),
    WZ3("其它", 8),
    WZ4("其它担保", 8),
    WZ5("--", 8),
    WZ6("——", 8),
    WZ7("", 8),
    WZ8(null, 8);

    public final String key;
    public final Integer value;

    GuaranteeTypeEnum(String key, Integer value) {
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
        Integer tName = null;
        for (GuaranteeTypeEnum em : values()) {
            if (key.equals(em.key)) {
                tName = em.value;
                break;
            }
        }
        return tName;
    }

    public static List<Map<String, Integer>> getWhole() {
        List<Map<String, Integer>> list = new ArrayList<Map<String, Integer>>();
        for (GuaranteeTypeEnum em : values()) {
            Map<String, Integer> map = new HashMap<String, Integer>();
            map.put(em.key, em.value);
            list.add(map);
        }
        return list;
    }
}
