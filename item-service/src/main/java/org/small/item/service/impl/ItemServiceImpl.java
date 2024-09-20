package org.small.item.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.small.api.dto.OrderDetailDTO;
import org.small.common.exception.BizIllegalException;
import org.small.common.utils.BeanUtils;
import org.small.item.domain.dto.ItemDTO;
import org.small.item.domain.po.Item;
import org.small.item.mapper.ItemMapper;
import org.small.item.service.IItemService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;

/**
 * <p>
 * 商品表 服务实现类
 * </p>
 */
@Service
public class ItemServiceImpl extends ServiceImpl<ItemMapper, Item> implements IItemService {

    @Override
    @Transactional
    public void deductStock(Collection<OrderDetailDTO> items) {
        String sqlStatement = "org.small.item.mapper.ItemMapper.updateStock";
        boolean r = false;
        try {
            r = executeBatch(items, (sqlSession, entity) -> sqlSession.update(sqlStatement, entity));
        } catch (Exception e) {
            log.error("更新库存异常", e);
            throw new BizIllegalException("库存不足！");
        }
        if (!r) {
            throw new BizIllegalException("库存不足！");
        }
    }
    @Override
    public List<ItemDTO> queryItemByIds(Collection<Long> ids) {
        List<Item> items = listByIds(ids);
        return BeanUtils.copyList(items, ItemDTO.class);
    }
}
