package com.ljj.gulimall.order.dao;

import com.ljj.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author ljj
 * @email 1061984275@qq.com
 * @date 2023-04-30 15:08:19
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
