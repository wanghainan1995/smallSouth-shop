package org.small.item.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.small.api.dto.OrderDetailDTO;
import org.small.item.domain.dto.ItemDTO;
import org.small.item.domain.po.Item;

import java.util.Collection;
import java.util.List;

/**
 * <p>
 * 商品表 服务类
 * </p>
 */
public interface IItemService extends IService<Item> {

    public void deductStock(Collection<OrderDetailDTO> items);

    public List<ItemDTO> queryItemByIds(Collection<Long> ids);
}

