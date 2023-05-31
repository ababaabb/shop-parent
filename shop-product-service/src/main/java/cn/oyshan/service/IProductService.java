package cn.oyshan.service;

import cn.oyshan.domain.Product;

/**
 * @description: TODO
 * @author: 欧阳珊
 * @date: 2023/5/3022:00
 */
public interface IProductService {

    public Product findByPid(Long pid);
}
