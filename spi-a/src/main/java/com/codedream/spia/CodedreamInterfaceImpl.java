package com.codedream.spia;

import com.codedream.auto.service.AutoService;
import com.codedream.spiinterface.CodedreamInterface;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import java.util.Properties;

/**
 * <p>Description: [spi接口实现类]</p >
 * Created on 2022-03-18
 *
 * @author mo
 */
@AutoService(CodedreamInterface.class)
public class CodedreamInterfaceImpl implements CodedreamInterface {
    @Override
    public void start() {
        try {
            System.out.println("spi实现类，根据spring.profiles.active动态读取相应配置");
            Properties properties = PropertiesLoaderUtils.loadAllProperties("application.properties");
            Properties props = System.getProperties();
            props.setProperty("logging.config", "classpath:spring-logback-" + properties.getProperty("spring.profiles.active") + ".xml");
            // 处理 Druid 异常提示 discard long time none received connection
            props.setProperty("druid.mysql.usePingMethod", "false");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}