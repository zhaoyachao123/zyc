package com.jk;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)

public class ProviderShiroApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderShiroApplication.class, args);
    }

}
