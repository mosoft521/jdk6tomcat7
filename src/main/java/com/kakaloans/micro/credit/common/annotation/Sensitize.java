/**
 * @Title: Desensitize.java
 * @Package com.kakaloans.micro.credit.common.annotation
 * @Description:
 * @author zhangjiawen
 * @date 2017年8月9日 上午11:32:40
 * @version V1.0
 */
package com.kakaloans.micro.credit.common.annotation;

import com.kakaloans.micro.credit.common.enums.ChannelRequestEnum;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 反脱敏注解
 *
 * @author zhangjiawen
 * @version V1.0
 * @Title: Desensitize.java
 * @Package com.kakaloans.micro.credit.common.annotation
 * @Description:
 * @date 2017年8月9日 上午11:32:40
 */
@Target(value = {ElementType.FIELD})
@Retention(value = RetentionPolicy.RUNTIME)
@Documented
public @interface Sensitize {
    Channel channel() default Channel.ZHONGYUAN;

    ChannelRequestEnum value() default ChannelRequestEnum.BigPercentageGrade;

    enum Channel {
        ZHONGYUAN,
        FENGNIAO
    }
}
