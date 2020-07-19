package com.hcf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@EnableTransactionManagement(proxyTargetClass = true)

@MapperScan({"com.hcf.dal.mapper.sharding"})
public class SpringbootShardingsphereExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootShardingsphereExampleApplication.class, args);
        System.out.println("------>springboot启动成功");
    }

}
