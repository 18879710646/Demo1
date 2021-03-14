package com.itheima.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.springframework.context.annotation.Configuration;

//配置的拦截文件
@Configuration
public class PageConfig {
    public PaginationInterceptor paginationInterceptor(){
        return  new PaginationInterceptor();
    }
}
