package com.jh.test02.controller;

import com.jh.test02.search.OrderSearch;
import com.jh.test02.service.IProductOrderService;
import com.jh.test02.vo.OrderVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Alan Chen
 * @description
 * @date 2019-10-10
 */
@RestController
@RequestMapping("/product-order-group")
public class ProductOrderController {

    @Autowired
    IProductOrderService productOrderServiceImpl;

    @GetMapping("/list")
    public List<OrderVO> orderList(OrderSearch search){
        return productOrderServiceImpl.orderList(search);
    }
}
