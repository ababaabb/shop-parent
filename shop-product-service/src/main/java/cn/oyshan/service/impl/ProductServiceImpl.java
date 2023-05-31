package cn.oyshan.service.impl;

import cn.oyshan.dao.ProductDao;
import cn.oyshan.domain.Product;
import cn.oyshan.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description: TODO
 * @author: 欧阳珊
 * @date: 2023/5/3022:01
 */
@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    private ProductDao productDao;
    @Override
    public Product findByPid(Long pid) {
        return productDao.findById(pid).get();
    }
}
