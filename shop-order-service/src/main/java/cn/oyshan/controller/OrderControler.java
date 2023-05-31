package cn.oyshan.controller;

import cn.oyshan.domain.Order;
import cn.oyshan.service.IOrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: TODO
 * @author: 欧阳珊
 * @date: 2023/5/3122:18
 */
@RestController
@Slf4j
public class OrderControler {

    @Autowired
    private IOrderService orderService;

    @RequestMapping("/save")
    public Order order(Long pid, Long uid) {
        return orderService.createOrder(pid,uid);
    }
}
