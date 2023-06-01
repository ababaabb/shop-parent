package cn.oyshan.service.impl;

import cn.oyshan.dao.OrderDao;
import cn.oyshan.domain.Order;
import cn.oyshan.domain.Product;
import cn.oyshan.feign.ProductFeignApi;
import cn.oyshan.service.IOrderService;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description: TODO
 * @author: 欧阳珊
 * @date: 2023/5/310:03
 */
@Service
@Slf4j
public class OrderServiceImpl implements IOrderService {

    @Autowired
    private OrderDao orderDao;
    @Autowired
    private ProductFeignApi productFeignApi;
    @Override
    public Order createOrder(Long productId, Long userId) {
        log.info("接收到{}号商品的下单请求，接下来调用商品微服务查询此商品信息",productId);
        Product product =productFeignApi.findByPid(productId);
        log.info("查询到{}号商品的信息，内容是：{}",productId, JSON.toJSONString(product));
        Order order = new Order();
        order.setUid(userId);
        order.setUsername("...");
        order.setPid(productId);
        order.setPname(product.getPname());
        order.setPprice(product.getPprice());
        order.setNumber(1);
        orderDao.save(order);
        log.info("创建订单成功，订单信息为{}",JSON.toJSONString(order));
        return order;
    }
}
