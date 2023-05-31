package cn.oyshan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @description: TODO
 * @author: 欧阳珊
 * @date: 2023/5/310:00
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderServer {
    public static void main(String[] args) {
        SpringApplication.run(OrderServer.class,args);
    }

    @Bean
    @LoadBalanced//表示集成Ribbon进行负载均衡
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
