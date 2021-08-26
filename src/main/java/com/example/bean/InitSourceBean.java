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
 * @date 2021/8/12 15:09
 * @description
 */
@Slf4j
@Order(2)
@Component
public class InitSourceBean implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("InitSourceBean start......");
    }
}
