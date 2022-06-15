package com.ex20.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ex20.common.utils.PageUtils;
import com.ex20.gulimall.product.entity.AttrAttrgroupRelationEntity;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author 高诚政
 * @email 15272888596@163.com
 * @date 2022-06-14 14:15:52
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

