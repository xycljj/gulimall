package com.ljj.gulimall.member.dao;

import com.ljj.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author ljj
 * @email 1061984275@qq.com
 * @date 2023-04-30 14:57:08
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
