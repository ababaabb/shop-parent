package cn.oyshan.dao;

import cn.oyshan.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @description: TODO
 * @author: 欧阳珊
 * @date: 2023/5/310:01
 */
public interface OrderDao extends JpaRepository<Order,Long> {
}
