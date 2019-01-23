package com.mlz.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mlz.entity.OperationLog;
import com.mlz.mapper.OperationLogMapper;
import com.mlz.service.OperationLogService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 操作日志 服务实现类
 * </p>
 *
 * @author ZhuJun
 * @since 2019-01-22
 */
@Service
public class OperationLogServiceImpl extends ServiceImpl<OperationLogMapper, OperationLog> implements OperationLogService {

}
