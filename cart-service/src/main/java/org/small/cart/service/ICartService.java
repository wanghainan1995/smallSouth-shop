package org.small.cart.service;


import com.baomidou.mybatisplus.extension.service.IService;
import org.small.cart.domain.dto.CartFormDTO;
import org.small.cart.domain.po.Cart;
import org.small.cart.domain.vo.CartVO;

import java.util.Collection;
import java.util.List;

/**
 * <p>
 * 订单详情表 服务类
 * </p>
 */
public interface ICartService extends IService<Cart> {

    void addItem2Cart(CartFormDTO cartFormDTO);

    List<CartVO> queryMyCarts();

    void removeByItemIds(Collection<Long> itemIds);
}
