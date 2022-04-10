# codedream-base-demo

codedreamplus-base组件的demo示例，Java spi、spring.factories文件自动生成工具使用示例

## 模块说明

* spi-interface spi接口
* spi-a spi实现，根据spring.profiles.active动态读取spring-logback-dev.xml配置
* spi-b spi实现，只打印日志，无逻辑处理
* mybaits 自动生成spring.factories文件，对MybatisConfig进行自动配置
* start 启动类

## 使用说明

* 环境为jdk11
* 在base-demo目录下执行mvn clean install，然后运行start模块中AutoDemoApplication启动类即可