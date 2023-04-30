package com.ljj.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ljj.common.utils.PageUtils;
import com.ljj.gulimall.coupon.entity.CouponEntity;

import java.util.Map;

/**
 * 优惠券信息
 *
 * @author ljj
 * @email 1061984275@qq.com
 * @date 2023-04-30 14:16:47
 */
public interface CouponService extends IService<CouponEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

