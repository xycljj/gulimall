package com.ljj.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ljj.common.utils.PageUtils;
import com.ljj.gulimall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author ljj
 * @email 1061984275@qq.com
 * @date 2023-04-30 14:57:08
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

