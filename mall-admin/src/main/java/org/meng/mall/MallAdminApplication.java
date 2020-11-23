package org.meng.mall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * @Created by menghanjun
 * @Date 2020/11/23 9:47 下午
 */
//@EnableFeignClients
//@EnableDiscoveryClient
@SpringBootApplication
public class MallAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(MallAdminApplication.class, args);
    }
}
