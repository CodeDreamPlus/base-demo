package com.codedreamplus.spiinterface.util;

import org.springframework.core.env.*;

import java.util.Arrays;
import java.util.List;

/**
 * <p>Description: [获取环境配置工具类]</p >
 * Created on 2022-03-18
 *
 * @author mo
 */
public class ProfileUtil {

    /**
     * 获取当前环境
     *
     * @param args
     * @return
     */
    public static String getCurrentProfile(String... args) {
        ConfigurableEnvironment environment = new StandardEnvironment();
        MutablePropertySources propertySources = environment.getPropertySources();
        propertySources.addFirst(new SimpleCommandLinePropertySource(args));
        propertySources.addLast(new MapPropertySource(StandardEnvironment.SYSTEM_PROPERTIES_PROPERTY_SOURCE_NAME, environment.getSystemProperties()));
        propertySources.addLast(new SystemEnvironmentPropertySource(StandardEnvironment.SYSTEM_ENVIRONMENT_PROPERTY_SOURCE_NAME, environment.getSystemEnvironment()));
        // 获取配置的环境变量
        String[] activeProfiles = environment.getActiveProfiles();
        // 判断环境:dev、test、prod
        List<String> profiles = Arrays.asList(activeProfiles);
        return profiles.get(0);
    }
}