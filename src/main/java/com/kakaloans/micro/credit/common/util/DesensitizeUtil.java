/**
 * @Title: DesensitizeUtil.java
 * @Package com.kakaloans.micro.credit.common.util
 * @Description:
 * @author zhangjiawen
 * @date 2017年8月9日 上午11:31:08
 * @version V1.0
 */
package com.kakaloans.micro.credit.common.util;

import com.kakaloans.micro.credit.common.annotation.Desensitize;
import com.kakaloans.micro.credit.common.enums.ChannelResposeEnum;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 脱敏工具类
 *
 * @author zhangjiawen
 * @version V1.0
 * @Title: DesensitizeUtil.java
 * @Package com.kakaloans.micro.credit.common.util
 * @Description:
 * @date 2017年8月9日 上午11:31:08
 */
public class DesensitizeUtil {
    /**
     * 日志工具
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(DesensitizeUtil.class);
    private static Map<String, String> channelResponseEnumMap = ChannelResposeEnum.getWholeMap();

    private DesensitizeUtil() {
        throw new Error("不要实例化我！");
    }

    /**
     * @Fields FAIL : 访问异常
     */
    public static int desensitize(String enumName, String mapKeyParam) {
        String mapKey;
        if (null != mapKeyParam) {
            mapKey = StringUtils.trim(mapKeyParam);
        } else {
            mapKey = mapKeyParam;
        }
        //反射取得Enum
        String enumNameKey = channelResponseEnumMap.get(enumName);
        String packageName = "com.kakaloans.micro.credit.common.enums.response.";
        String className = packageName + enumNameKey;
        try {
            Class<Enum> clazz = (Class<Enum>) Class.forName(className);
            Method staticMethod = clazz.getDeclaredMethod("getValueByKey", String.class);
            int i = (Integer) staticMethod.invoke(clazz, mapKey);
            return i;
        } catch (InvocationTargetException ite) {
            // TODO Auto-generated catch block
            ite.printStackTrace();
        } catch (IllegalAccessException iae) {
            // TODO Auto-generated catch block
            iae.printStackTrace();
        } catch (NoSuchMethodException nsme) {
            // TODO Auto-generated catch block
            nsme.printStackTrace();
        } catch (ClassNotFoundException cnfe) {
            // TODO Auto-generated catch block
            cnfe.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

    /**
     * @Fields FAIL : 访问异常
     */
    public static int desensitize(ChannelResposeEnum en, String mapKeyParam) {
        String mapKey;
        if (null != mapKeyParam) {
            mapKey = StringUtils.trim(mapKeyParam);
        } else {
            mapKey = mapKeyParam;
        }
        //特殊处理
        if (en == ChannelResposeEnum.BigPercentageGrade) {
            //百万
            // 按百分制记
            //先按大范围分为10档
            //分别为1-10000,10001-40000,40001-90000,90001-160000,160001-250000,250001-360000,360001-490000,490001-640000,640001-810000,810001-1000000
            //然后对每一档再分为10档例1-10000中分为：
            //1-1000，1001-2000,2001-3000…
            //10001-40000中分期：
            //10001-13000,13001-16000,16001-19000…
            //40001-90000中分为：
            //40001-45000,45001-50000,50001-55000..
            //.依次类推，0单独归为一档1000000+归入最后一档，总计101档

            if (StringUtils.isBlank(mapKey)) {
                mapKey = "0";
            }
            //采用数学公式优化之
            double xySn = Double.parseDouble(mapKey);
            double xn_d = Math.sqrt(xySn / 10000);
            int xn = (int) xn_d;
            int xSn = xn * 10000 + xn * (xn - 1) * 20000 / 2;
            int ySn = (int) (xySn - xSn);
            double yn_d = (double) ySn / (1000 + 2000 * xn);
            int yn = (int) yn_d;
            int xy = xn * 10 + yn + 2;
            //对边界做处理
            if (xySn == 0 || (xn_d == (double) xn || yn_d == (double) yn)) {
                --xy;
            }
            return xy > 101 ? 101 : xy;

        } else if (en == ChannelResposeEnum.SmallPercentageGrade) {
            //十万
            //按百分制记
            //先按大范围分为10档
            //分别为1-1000,1001-4000,4001-9000,9001-16000,16001-25000,25001-36000,36001-49000,49001-64000,64001-81000,81001-100000
            //然后对每一档再分为10档例1-1000中分为：
            //1-100，101-200,201-300…
            //1001-4000中分期：
            //1001-1300,1301-1600,1601-1900…
            //4001-9000中分为：
            //4001-4500,4501-5000,5001-5500..
            //.依次类推，0单独归为一档100000+归入最后一档，总计101档

            if (StringUtils.isBlank(mapKey)) {
                mapKey = "0";
            }
            //采用数学公式优化之
            double xySn = Double.parseDouble(mapKey);
            double xn_d = Math.sqrt(xySn / 1000);
            int xn = (int) xn_d;
            int xSn = xn * 1000 + xn * (xn - 1) * 2000 / 2;
            int ySn = (int) (xySn - xSn);
            double yn_d = (double) ySn / (100 + 200 * xn);
            int yn = (int) yn_d;
            int xy = xn * 10 + yn + 2;
            //对边界做处理
            if (xySn == 0 || (xn_d == (double) xn || yn_d == (double) yn)) {
                --xy;
            }
            return xy > 101 ? 101 : xy;
        } else {
            if (StringUtils.isBlank(mapKey)) {
                mapKey = "";
            }
            //反射取得Enum
            String enumName = en.value;
            String packageName = "com.kakaloans.micro.credit.common.enums.response.";
            String className = packageName + enumName;
            try {
                Class<Enum> clazz = (Class<Enum>) Class.forName(className);
                Method staticMethod = clazz.getDeclaredMethod("getValueByKey", String.class);
                int i = (Integer) staticMethod.invoke(clazz, mapKey);
                return i;
            } catch (InvocationTargetException ite) {
                // TODO Auto-generated catch block
                ite.printStackTrace();
            } catch (IllegalAccessException iae) {
                // TODO Auto-generated catch block
                iae.printStackTrace();
            } catch (NoSuchMethodException nsme) {
                // TODO Auto-generated catch block
                nsme.printStackTrace();
            } catch (ClassNotFoundException cnfe) {
                // TODO Auto-generated catch block
                cnfe.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return -1;
    }

    /**
     * 获取指定属性指定注解
     *
     * @param field
     * @param annClazz
     * @return
     */
    public static Annotation getFieldAnnotation(Field field, Class<? extends Annotation> annClazz) {
        if (field.isAnnotationPresent(annClazz)) {
            return field.getAnnotation(annClazz);
        }
        return null;
    }

    /**
     * 获取所有属性指定注解
     *
     * @param fields
     * @param annClazz
     * @return
     */
    public static Map<Field, Annotation> getFieldsAnnotation(Field[] fields, Class<? extends Annotation> annClazz) {
        Map<Field, Annotation> annMap = new HashMap<Field, Annotation>();
        for (Field f : fields) {
            if (f.isAnnotationPresent(annClazz)) {
                annMap.put(f, f.getAnnotation(annClazz));
            }
        }
        return annMap;
    }

    /**
     * 获取所有属性所有注解
     *
     * @param fields
     * @param annClazz
     * @return
     */
    public static Map<Field, Annotation[]> getFieldsAnnotations(Field[] fields, Class<? extends Annotation> annClazz) {
        Map<Field, Annotation[]> annMap = new HashMap<Field, Annotation[]>();
        for (Field f : fields) {
            annMap.put(f, f.getAnnotations());
        }
        return annMap;
    }

    public static void desensitize(Object obj) {
//        printFieldAnno(12, CreditCardInfo.class, Desensitize.class, "Desensitize");
        Class<?> clazz = obj.getClass();
        Class<? extends Annotation> annClazz = Desensitize.class;
        String type = "Desensitize";
        Map<Field, Annotation> annWFMap = getFieldsAnnotation(clazz.getDeclaredFields(), annClazz);
        LOGGER.debug(">>>---Map<Field, Annotation> annWFMap = getFieldsAnnotation(" + clazz.getSimpleName() + ".class.getFields(), " + annClazz.getSimpleName() + ".class)-" + annWFMap.size());
        if ((annWFMap != null) && ((annWFMap.size() > 0))) {
            Iterator<Map.Entry<Field, Annotation>> itPF = annWFMap.entrySet().iterator();
            while (itPF.hasNext()) {
                Map.Entry<Field, Annotation> ety = itPF.next();
                Object anno = ety.getValue();
                if (type.equals("Desensitize")) {
                    LOGGER.debug(ety.getKey().toString());
                    LOGGER.debug(ety.getKey().getName() + " = " + ((Desensitize) anno).channel() + " - " + ((Desensitize) anno).value());
                    try {
                        //获取私有的字段的值
                        String mapKey = "";
                        ety.getKey().setAccessible(true);
                        if (null == ety.getKey().get(obj)) {
                            mapKey = null;
                        } else {
                            if (ety.getKey().getType().equals(String.class)) {
                                mapKey = (String) ety.getKey().get(obj);
                            } else if (ety.getKey().getType().equals(BigDecimal.class)) {
                                mapKey = ((BigDecimal) ety.getKey().get(obj)).toString();
                            } else if (ety.getKey().getType().equals(Integer.class)) {

                                mapKey = Integer.toString((Integer) ety.getKey().get(obj));
                            } else if (ety.getKey().getType().equals(Long.class)) {
                                mapKey = Long.toString((Long) ety.getKey().get(obj));
                            } else if (ety.getKey().getType().equals(Double.class)) {
                                mapKey = Double.toString((Double) ety.getKey().get(obj));
                            } else {
                                LOGGER.error("err");
                            }
                        }

                        int ret = DesensitizeUtil.desensitize(((Desensitize) anno).value(), mapKey);
                        if (-1 == ret) {
                            if (ety.getKey().getType().equals(String.class)) {
                                ety.getKey().set(obj, "");
                            } else {
                                ety.getKey().set(obj, null);
                            }
                        } else {
                            // 给私有字段设置值
                            if (ety.getKey().getType().equals(String.class)) {
                                ety.getKey().set(obj, Integer.toString(ret));
                            } else if (ety.getKey().getType().equals(BigDecimal.class)) {
                                ety.getKey().set(obj, new BigDecimal(ret));
                            } else if (ety.getKey().getType().equals(Integer.class)) {
                                ety.getKey().set(obj, ret);
                            } else if (ety.getKey().getType().equals(Long.class)) {
                                ety.getKey().set(obj, Long.valueOf(ret));
                            } else if (ety.getKey().getType().equals(Double.class)) {
                                ety.getKey().set(obj, Double.valueOf(ret));
                            } else {
                                LOGGER.error("err");
                            }
                        }

                        ety.getKey().setAccessible(false);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        } else {
            LOGGER.debug(clazz.getSimpleName() + "的属性上面没有使用" + annClazz.getSimpleName() + "注解，所以打印不出来");
        }
        LOGGER.debug("------------------------------------------------------------------------------------------------------------------------------------------------\n");
    }

    //调用例子
//    public static void main(String[] args) {
//        LOGGER.info(DesensitizeUtil.desensitize(ZhongyuanResposeEnum.BigPercentageGrade, "0"));//1
//        LOGGER.info(DesensitizeUtil.desensitize(ZhongyuanResposeEnum.BigPercentageGrade, "1"));//2
//        LOGGER.info(DesensitizeUtil.desensitize(ZhongyuanResposeEnum.BigPercentageGrade, "11"));//2
//        LOGGER.info(DesensitizeUtil.desensitize(ZhongyuanResposeEnum.BigPercentageGrade, "1000"));//2 y边界
//        LOGGER.info(DesensitizeUtil.desensitize(ZhongyuanResposeEnum.BigPercentageGrade, "1001"));//3
//        LOGGER.info(DesensitizeUtil.desensitize(ZhongyuanResposeEnum.BigPercentageGrade, "1034"));//3
//        LOGGER.info(DesensitizeUtil.desensitize(ZhongyuanResposeEnum.BigPercentageGrade, "8000"));//9 y边界
//        LOGGER.info(DesensitizeUtil.desensitize(ZhongyuanResposeEnum.BigPercentageGrade, "8001"));//10
//        LOGGER.info(DesensitizeUtil.desensitize(ZhongyuanResposeEnum.BigPercentageGrade, "10000"));//11 x边界
//        LOGGER.info(DesensitizeUtil.desensitize(ZhongyuanResposeEnum.BigPercentageGrade, "10001"));//12
//        LOGGER.info(DesensitizeUtil.desensitize(ZhongyuanResposeEnum.BigPercentageGrade, "45450"));//23
//        LOGGER.info(DesensitizeUtil.desensitize(ZhongyuanResposeEnum.BigPercentageGrade, "80000"));//29
//        LOGGER.info(DesensitizeUtil.desensitize(ZhongyuanResposeEnum.BigPercentageGrade, "80001"));//30
//        LOGGER.info(DesensitizeUtil.desensitize(ZhongyuanResposeEnum.BigPercentageGrade, "905005"));//97
//        LOGGER.info(DesensitizeUtil.desensitize(ZhongyuanResposeEnum.BigPercentageGrade, "1005005"));//101
//        LOGGER.info(DesensitizeUtil.desensitize(ZhongyuanResposeEnum.BigPercentageGrade, "2005005"));//101
//
//        LOGGER.info("====================================");
//
//        LOGGER.info(DesensitizeUtil.desensitize(ZhongyuanResposeEnum.SmallPercentageGrade, "0"));//1
//        LOGGER.info(DesensitizeUtil.desensitize(ZhongyuanResposeEnum.SmallPercentageGrade, "1"));//2
//        LOGGER.info(DesensitizeUtil.desensitize(ZhongyuanResposeEnum.SmallPercentageGrade, "11"));//2
//        LOGGER.info(DesensitizeUtil.desensitize(ZhongyuanResposeEnum.SmallPercentageGrade, "99"));//2
//        LOGGER.info(DesensitizeUtil.desensitize(ZhongyuanResposeEnum.SmallPercentageGrade, "100"));//2 y边界
//        LOGGER.info(DesensitizeUtil.desensitize(ZhongyuanResposeEnum.SmallPercentageGrade, "101"));//3
//        LOGGER.info(DesensitizeUtil.desensitize(ZhongyuanResposeEnum.SmallPercentageGrade, "102"));//3
//        LOGGER.info(DesensitizeUtil.desensitize(ZhongyuanResposeEnum.SmallPercentageGrade, "799"));//9
//        LOGGER.info(DesensitizeUtil.desensitize(ZhongyuanResposeEnum.SmallPercentageGrade, "800"));//9 y边界
//        LOGGER.info(DesensitizeUtil.desensitize(ZhongyuanResposeEnum.SmallPercentageGrade, "801"));//10
//        LOGGER.info(DesensitizeUtil.desensitize(ZhongyuanResposeEnum.SmallPercentageGrade, "8000"));//29
//        LOGGER.info(DesensitizeUtil.desensitize(ZhongyuanResposeEnum.SmallPercentageGrade, "8001"));//30
//        LOGGER.info(DesensitizeUtil.desensitize(ZhongyuanResposeEnum.SmallPercentageGrade, "10000"));//33
//        LOGGER.info(DesensitizeUtil.desensitize(ZhongyuanResposeEnum.SmallPercentageGrade, "10001"));//33
//        LOGGER.info(DesensitizeUtil.desensitize(ZhongyuanResposeEnum.SmallPercentageGrade, "45450"));//69
//        LOGGER.info(DesensitizeUtil.desensitize(ZhongyuanResposeEnum.SmallPercentageGrade, "905005"));//101
//        LOGGER.info(DesensitizeUtil.desensitize(ZhongyuanResposeEnum.SmallPercentageGrade, "1005005"));//101
//        LOGGER.info(DesensitizeUtil.desensitize(ZhongyuanResposeEnum.SmallPercentageGrade, "2005005"));//101

//        LOGGER.info("====================================");

    // 对象脱敏demo 01
//        CreditCardInfo creditCardInfo = new CreditCardInfo();
//        creditCardInfo.setGuaranteeType("--");
//        creditCardInfo.setCurrency(null);
//        DesensitizeUtil.desensitize(creditCardInfo);

//        LOGGER.info("====================================");
//    }
}
