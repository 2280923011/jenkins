package com.aaa.tree;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * className:SpringBootMainAppliction
 * discription:
 * author:陈同学
 * createTime:2018-11-21 09:32
 */
@SpringBootApplication
@MapperScan("com.aaa.tree.dao")//扫默dao层接口
public class SpringBootMainAppliction {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootMainAppliction.class);
    }
}
