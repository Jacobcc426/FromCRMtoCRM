package cn.com.lshmnc.FromCRMtoCRM.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 * Created by macro on 2019/4/8.
 */
@Configuration
@MapperScan({"cn.com.lshmnc.FromCRMtoCRM.mbg.mapper","cn.com.lshmnc.FromCRMtoCRM.dao"})
public class MyBatisConfig {
}