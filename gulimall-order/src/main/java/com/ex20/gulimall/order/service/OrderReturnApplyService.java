package com.ex20.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ex20.common.utils.PageUtils;
import com.ex20.gulimall.order.entity.OrderReturnApplyEntity;

import java.util.Map;

/**
 * 订单退货申请
 *
 * @author 高诚政
 * @email 15272888596@163.com
 * @date 2022-06-14 16:19:25
 */
public interface OrderReturnApplyService extends IService<OrderReturnApplyEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

