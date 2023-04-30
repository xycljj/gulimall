package com.ljj.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ljj.common.utils.PageUtils;
import com.ljj.gulimall.coupon.entity.SeckillSkuNoticeEntity;

import java.util.Map;

/**
 * 秒杀商品通知订阅
 *
 * @author ljj
 * @email 1061984275@qq.com
 * @date 2023-04-30 14:16:47
 */
public interface SeckillSkuNoticeService extends IService<SeckillSkuNoticeEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

