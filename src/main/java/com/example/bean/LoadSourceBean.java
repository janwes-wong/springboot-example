package com.example.bean;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author Janwes
 * @version 1.0
 * @package com.example.bean
 * @date 2021/8/12 15:10
 * @description ApplicationRunner实现springboot应用启动后做一些初始化操作
 */
@Slf4j
@Order(1) // @Order注解指定该bean的程序运行顺序
@Component
public class LoadSourceBean implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("LoadSourceBean start......");
    }
}
