package com.ljj.gulimall.member.feign;

import com.ljj.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
    这是声明式的远程调用
 */
@FeignClient("gulimall-coupon")
public interface CouponFeignServer {

    @RequestMapping("coupon/coupon/member/list")
    public R memberCoupons();
}
