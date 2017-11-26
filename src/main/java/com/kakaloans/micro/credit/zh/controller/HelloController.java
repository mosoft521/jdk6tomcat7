package com.kakaloans.micro.credit.zh.controller;

import com.kakaloans.micro.credit.zh.dto.TestBean;
import org.apache.commons.lang.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * 快速启动 spring-boot
 */
@RestController
public class HelloController {

    /**
     * The class is flagged as a @RestController,meaning it’s ready for use by Spring MVC to handle web requests.
     * @RequestMapping maps / to the index() method. When invoked(调用) from a browser or using curl on the command line,
     * the method returns pure(单纯的) text.
     *
     * That’s because @RestController combines(结合) @Controller and @ResponseBody,
     * two annotations that results in web requests returning data rather than a view.
     *
     * 那是因为@RestController联合了@Controller and @ResponseBody两个注解导致返回的是数据而不是视图
     */

    /**
     * Hello spring-boot-1-QuickStart！！！
     *
     * @return
     */
    @RequestMapping("/hello")
    public String hello() {
        System.out.println("Hello Spring-Boot");
        return "Hello spring-boot-QuickStart！！！";
    }

    @RequestMapping("/convertHello")
    public
    @ResponseBody
    TestBean convert(@RequestBody Map<String, Object> paramMap) {
        System.out.println("Hello Spring-Boot");
        TestBean testBean = new TestBean();
        String name = (String) paramMap.get("name");
        if (StringUtils.isBlank(name)) {
            testBean.setName("todo");
        } else {
            testBean.setName(name);
        }
        testBean.setAge(33);
        return testBean;
    }
}