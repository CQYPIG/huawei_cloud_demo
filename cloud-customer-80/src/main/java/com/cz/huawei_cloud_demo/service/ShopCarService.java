package com.cz.huawei_cloud_demo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import utils.Result;
import utils.entity.ShopCarCommodity;

@Component
@FeignClient(name = "SHOPCAR-8002")
public interface ShopCarService {
        //购物车添加商品
        @PostMapping("/addShopCar")
        public Result addShopCar(ShopCarCommodity shopCarCommodity);

        //根据用户id获取用户购物车所有商品
        @GetMapping("/getAllShopCarCommodity/{userId}")
        public Result getAllSCCommodity(@PathVariable("userId") String userId);

        //使用直接操作数据库的方式
        @GetMapping("/changeCommodityNumber/{commodityNumber}/{shopCarId}/{userId}")
        public Result changeCommodityNumber(@PathVariable("commodityNumber") String commodityNumber,
                                            @PathVariable("shopCarId") String shopCarId,
                                            @PathVariable("userId")String userId);

        @GetMapping("/deleteShopCar/{shopCarId}/{userId}")
        public Result deleteShopCar(@PathVariable("shopCarId")String shopCarId,@PathVariable("userId")String userId);

        //删除用户选中的购物车商品
        @PostMapping("deleteShopCars/{userId}")
        public Result deleteShopCars(String[] SCCommodityList,@PathVariable("userId") String userId);
}
