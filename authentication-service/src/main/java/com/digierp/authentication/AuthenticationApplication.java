package com.digierp.authentication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author liuhao
 * @date 2020/4/14
 */
@SpringBootApplication(scanBasePackages = {"com.digierp.authentication", "com.digierp.common"})
public class AuthenticationApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthenticationApplication.class, args);
    }

}
