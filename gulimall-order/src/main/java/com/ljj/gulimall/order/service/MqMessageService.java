package com.ljj.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ljj.common.utils.PageUtils;
import com.ljj.gulimall.order.entity.MqMessageEntity;

import java.util.Map;

/**
 * 
 *
 * @author ljj
 * @email 1061984275@qq.com
 * @date 2023-04-30 15:08:18
 */
public interface MqMessageService extends IService<MqMessageEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

