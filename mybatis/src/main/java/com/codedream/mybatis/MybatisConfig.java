package com.codedream.mybatis;

import com.codedream.auto.properties.CodeDreamPropertySource;
import org.springframework.context.annotation.Configuration;

/**
 * <p>Description: [mybatis配置]</p >
 * Created on 2022-03-19
 *
 * @author mo
 */
@CodeDreamPropertySource(value = "classpath:/codedream-mybatis.yml")
@Configuration(proxyBeanMethods = false)
public class MybatisConfig {

    public MybatisConfig() {
        System.out.println("MybatisConfig容器启动初始化");
    }
}