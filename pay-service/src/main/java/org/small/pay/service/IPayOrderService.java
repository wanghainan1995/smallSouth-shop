package org.small.pay.service;


import com.baomidou.mybatisplus.extension.service.IService;
import org.small.pay.domain.dto.PayApplyDTO;
import org.small.pay.domain.dto.PayOrderFormDTO;
import org.small.pay.domain.po.PayOrder;

/**
 * <p>
 * 支付订单 服务类
 * </p>
 */
public interface IPayOrderService extends IService<PayOrder> {

    String applyPayOrder(PayApplyDTO applyDTO);

    void tryPayOrderByBalance(PayOrderFormDTO payOrderFormDTO);
}
