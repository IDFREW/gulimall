package com.ex20.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ex20.common.utils.PageUtils;
import com.ex20.gulimall.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author 高诚政
 * @email 15272888596@163.com
 * @date 2022-06-14 14:15:52
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

