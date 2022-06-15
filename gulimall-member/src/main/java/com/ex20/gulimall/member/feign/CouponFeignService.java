package com.ex20.gulimall.member.feign;

import com.ex20.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * <p>创建时间: 2022年06月15日 10:44 </p>
 * 一个声明式的远程调用
 * @author 高诚政
 */
@FeignClient("gulimall-coupon")
public interface CouponFeignService {

    @RequestMapping("/coupon/coupon/list")
    R list(@RequestParam Map<String, Object> params);

    @GetMapping("/coupon/coupon/configs")
    R configText();

}
