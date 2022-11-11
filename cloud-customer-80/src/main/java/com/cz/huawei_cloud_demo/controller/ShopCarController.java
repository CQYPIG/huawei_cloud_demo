package com.cz.huawei_cloud_demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import utils.Result;

@RestController
public class ShopCarController {

    private final String SERVICE_NAME = "SHOPCAR80";

    //购物车添加商品
    @PostMapping("/addShopCar")
    public Result addShopCar(ShopCarCommodity shopCarCommodity){
        return null;
    }

    //根据用户id获取用户购物车所有商品
    @GetMapping("/getAllShopCarCommodity/{userId}")
    public Result getAllSCCommodity(@PathVariable("userId") String userId){
        return null;
    }

    //使用直接操作数据库的方式
    @GetMapping("/changeCommodityNumber/{commodityNumber}/{shopCarId}/{userId}")
    public Result changeCommodityNumber(@PathVariable("commodityNumber") String commodityNumber,
                                        @PathVariable("shopCarId") String shopCarId,
                                        @PathVariable("userId")String userId){
        return null;
    }

    @GetMapping("/deleteShopCar/{shopCarId}/{userId}")
    public Result deleteShopCar(@PathVariable("shopCarId")String shopCarId,@PathVariable("userId")String userId){
        return null;
    }

    //删除用户选中的购物车商品
    @PostMapping("deleteShopCars")
    public Result deleteShopCars(String[] SCCommodityList,String userId){
        return null;
    }

}
