package cn.haina;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@SpringBootApplication
@EnableCaching
@MapperScan(value = "cn.haina.dao")
public class SearchBoot {
    public static void main(String[] args) {
        SpringApplication.run(SearchBoot.class,args);
    }
}
