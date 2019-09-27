package com.wjc.stu;

import com.wjc.stu.filter.MyFilter;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(scanBasePackages = "com.wjc.stu")
@MapperScan("com.wjc.stu.dao")
public class StuApplication {

    public static void main(String[] args) {
        SpringApplication.run(StuApplication.class, args);
    }

    @Bean
    public FilterRegistrationBean FilterBean(){
        FilterRegistrationBean filterBean = new FilterRegistrationBean();
        filterBean.setName("myFilter");
        filterBean.setFilter(new MyFilter());
        filterBean.addUrlPatterns("/*");
        return filterBean;
    }
}
