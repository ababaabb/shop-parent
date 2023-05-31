package cn.oyshan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @description: TODO
 * @author: 欧阳珊
 * @date: 2023/5/2922:45
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ProductServer {
    public static void main(String[] args) {
        SpringApplication.run(ProductServer.class,args);
    }
}
