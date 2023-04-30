package com.ljj.gulimall.order.dao;

import com.ljj.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author ljj
 * @email 1061984275@qq.com
 * @date 2023-04-30 15:08:18
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
