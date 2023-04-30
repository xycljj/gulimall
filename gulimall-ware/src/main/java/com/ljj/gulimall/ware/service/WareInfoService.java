package com.ljj.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ljj.common.utils.PageUtils;
import com.ljj.gulimall.ware.entity.WareInfoEntity;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author ljj
 * @email 1061984275@qq.com
 * @date 2023-04-30 15:14:27
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

