package com.ex20.gulimall.coupon.dao;

import com.ex20.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author 高诚政
 * @email 15272888596@163.com
 * @date 2022-06-14 16:01:36
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
