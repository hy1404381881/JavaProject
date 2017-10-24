package org.exam.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import javax.annotation.Resource;
/**
 * Created by xin on 15/1/7.
 */
@Configuration
@ComponentScan(basePackages={"org.exam.service.impl"})
@PropertySource("classpath:config.properties")
public class AppConfig{
    @Resource
    private Environment env;
}
