package com.tijian;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author : rbe
 * @date : 2024/9/5 10:50
 */

@SpringBootApplication
@Slf4j
public class Application implements ApplicationRunner {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Value("${server.port}")
    private Integer port;

    @Override
    public void run(ApplicationArguments args){
        String index = "http://127.0.0.1:"+port;
        log.info("启动成功，点击访问文档：{}/doc.html",index);
    }

}
