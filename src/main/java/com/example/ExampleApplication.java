package com.example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Janwes
 * @version 1.0
 * @package com.example
 * @date 2021/8/12 15:00
 * @description
 */
@Slf4j
@SpringBootApplication
public class ExampleApplication {
    public static void main(String[] args) {
        log.info("[应用启动开始]spring application start......");
        SpringApplication.run(ExampleApplication.class, args);
        log.info("[应用启动完成]spring application end......");
    }
}
