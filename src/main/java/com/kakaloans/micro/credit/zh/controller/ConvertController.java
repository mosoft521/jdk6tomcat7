package com.kakaloans.micro.credit.zh.controller;

import com.kakaloans.micro.credit.zh.service.ConvertConvertService;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConvertController {

    private static final Logger logger = LoggerFactory.getLogger(ConvertController.class);

    @Autowired
    private ConvertConvertService creditOutConvertService;

    @RequestMapping("/convert")
    public String convert(@RequestBody String yhCreditJson) {
        try {
            logger.info("征信数据转换前:" + yhCreditJson);
            if (StringUtils.isBlank(yhCreditJson)) {
                logger.info("征信数据转换,参数不能为空！！！");
                return "征信数据转换,参数不能为空！！！";
            }
            String creditJsonAfterConvert = creditOutConvertService.convertCreditJson(yhCreditJson);
            logger.info("征信数据转换后:" + creditJsonAfterConvert);
            return creditJsonAfterConvert;
        } catch (Exception e) {
            logger.info("征信数据转换发生异常:" + e.getMessage(), e);
            return "征信数据转换发生异常！！！";
        }

    }

}
