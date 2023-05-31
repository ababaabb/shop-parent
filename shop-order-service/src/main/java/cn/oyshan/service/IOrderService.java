package cn.oyshan.service;

import cn.oyshan.domain.Order;

/**
 * @description: TODO
 * @author: 欧阳珊
 * @date: 2023/5/310:02
 */
public interface IOrderService {

    Order createOrder(Long productId,Long userId);
}
