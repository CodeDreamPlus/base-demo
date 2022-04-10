package com.codedreamplus.autodemo;

import com.codedreamplus.mybatis.MybatisConfig;
import com.codedreamplus.spiinterface.CodedreamInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

@SpringBootApplication
public class AutoDemoApplication {
    @Autowired
    private MybatisConfig mybatisConfig;

    public static void main(String[] args) {
        List<CodedreamInterface> codedreamInterfaceImplList = new ArrayList<>();
        //加载spi实现
        ServiceLoader.load(CodedreamInterface.class).forEach(codedreamInterfaceImplList::add);
        //执行
        codedreamInterfaceImplList.stream().forEach(impl -> impl.start());
        SpringApplication.run(AutoDemoApplication.class, args);
    }

}
