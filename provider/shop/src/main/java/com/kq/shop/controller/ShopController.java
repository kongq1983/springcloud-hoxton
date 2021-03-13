package com.kq.shop.controller;

import com.kq.entity.Shop;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * ShopController
 *
 * @author kq
 * @date 2021/3/13 23:55
 * @since 1.0.0
 */

@RestController
public class ShopController {

    @RequestMapping("/")
    public String home() {
        return "Welcome Shop Service Application!";
    }

    @RequestMapping("/shop/list/{shopId}")
    @HystrixCommand
    public Shop provider(@PathVariable("shopId") Long shopId) {

        Shop shop = new Shop();
        shop.setId(shopId);
        shop.setName("real");

        return shop;
    }

}
