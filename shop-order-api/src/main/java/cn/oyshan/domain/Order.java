package cn.oyshan.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @description: TODO
 * @author: 欧阳珊
 * @date: 2023/5/3023:56
 */
@Entity(name = "t_shop_order")
@Data
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long oid;

    private Long uid;

    private String username;

    private Long pid;
    private String pname;

    private Double pprice;

    private Integer number;
}
