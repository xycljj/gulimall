package com.ljj.gulimall.product.dao;

import com.ljj.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author ljj
 * @email 1061984275@qq.com
 * @date 2023-04-28 14:16:18
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
