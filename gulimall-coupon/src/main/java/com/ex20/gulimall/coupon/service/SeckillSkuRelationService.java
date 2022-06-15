package com.ex20.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ex20.common.utils.PageUtils;
import com.ex20.gulimall.coupon.entity.SeckillSkuRelationEntity;

import java.util.Map;

/**
 * 秒杀活动商品关联
 *
 * @author 高诚政
 * @email 15272888596@163.com
 * @date 2022-06-14 16:01:36
 */
public interface SeckillSkuRelationService extends IService<SeckillSkuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

