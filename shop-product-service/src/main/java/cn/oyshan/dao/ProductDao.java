package cn.oyshan.dao;

import cn.oyshan.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @description: TODO
 * @author: 欧阳珊
 * @date: 2023/5/3021:55
 */
public interface ProductDao extends JpaRepository<Product,Long> {
}
