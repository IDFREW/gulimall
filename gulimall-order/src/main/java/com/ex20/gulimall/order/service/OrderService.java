package com.ex20.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ex20.common.utils.PageUtils;
import com.ex20.gulimall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author 高诚政
 * @email 15272888596@163.com
 * @date 2022-06-14 16:19:25
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

