package org.small.trade.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.small.trade.domain.dto.OrderFormDTO;
import org.small.trade.domain.po.Order;

/**
 * <p>
 *  服务类
 * </p>
 */
public interface IOrderService extends IService<Order> {

    Long createOrder(OrderFormDTO orderFormDTO);

    void markOrderPaySuccess(Long orderId);

    void cancelOrder(Long orderId);
}
