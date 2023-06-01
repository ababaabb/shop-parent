package cn.oyshan.feign;

import cn.oyshan.domain.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description: TODO
 * @author: 欧阳珊
 * @date: 2023/6/122:13
 */
@FeignClient(name = "product-service")
public interface ProductFeignApi {

    @RequestMapping("/product/{pid}")
    Product findByPid(@PathVariable("pid") Long pid);
}
