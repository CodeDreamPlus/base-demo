package com.codedreamplus.spib;

import com.codedreamplus.auto.service.AutoService;
import com.codedreamplus.spiinterface.CodedreamInterface;

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
        System.out.println("这里啥也不做，只输出日志");
    }
}