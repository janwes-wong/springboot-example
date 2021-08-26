package com.example.config;

import com.example.bean.MonitorSourceBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.annotation.PostConstruct;

/**
 * @author Janwes
 * @version 1.0
 * @package com.example.config
 * @date 2021/8/12 15:19
 * @description
 */
@Slf4j
@Configuration
public class CommonConfig {

    @PostConstruct // 该@PostConstruct表示springboot容器启动后优先执行该方法
    public void init() {
        log.info("[初始化方法开始执行]init method start......");
    }

    @Primary // 优先方案，被注解的实现，优先被注入
    @Bean
    public MonitorSourceBean monitorSourceBean() {
        log.info("[MonitorSourceBean优先启动]MonitorSourceBean primary start......");
        return new MonitorSourceBean();
    }
}
