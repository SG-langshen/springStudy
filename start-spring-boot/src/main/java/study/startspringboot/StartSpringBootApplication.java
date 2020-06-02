package study.startspringboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 程序的主入口
 * @author only you 
 */
@SpringBootApplication
@MapperScan("study.startspringboot.mapper")
public class StartSpringBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(StartSpringBootApplication.class, args);
    }
}
