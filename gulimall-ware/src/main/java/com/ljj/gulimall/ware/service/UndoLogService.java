package com.ljj.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ljj.common.utils.PageUtils;
import com.ljj.gulimall.ware.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author ljj
 * @email 1061984275@qq.com
 * @date 2023-04-30 15:14:27
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

