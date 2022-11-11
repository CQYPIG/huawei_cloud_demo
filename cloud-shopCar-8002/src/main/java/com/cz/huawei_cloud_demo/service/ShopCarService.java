package com.cz.huawei_cloud_demo.service;

import com.cz.huawei_cloud_demo.utils.MyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import utils.Result;
import utils.entity.ShopCarCommodity;

import java.util.List;


@Service
public interface ShopCarService {

    //添加购物车商品
    Result addShopCarCommodity(ShopCarCommodity shopCarCommodity);

    /*根据用户id查询所有购物车商品*/
    Result getAllSCCommodity(String userId);


    /*根据id删除指定购物车商品*/
    Result deleteShopCar(String shopCarId,String userId);

    Result deleteShopCars(String[] shopCarIds,String userId);

    Result changeCommodityNumber(String commodityNumber,String shopCarId,String userId);


}
