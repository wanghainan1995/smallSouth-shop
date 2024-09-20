package org.small.trade.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.small.trade.domain.po.OrderDetail;
import org.small.trade.mapper.OrderDetailMapper;
import org.small.trade.service.IOrderDetailService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单详情表 服务实现类
 * </p>
 */
@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements IOrderDetailService {

}
