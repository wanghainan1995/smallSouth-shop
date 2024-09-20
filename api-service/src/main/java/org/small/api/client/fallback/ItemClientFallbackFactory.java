package org.small.api.client.fallback;

import lombok.extern.slf4j.Slf4j;
import org.small.api.client.ItemClient;
import org.small.api.dto.ItemDTO;
import org.small.api.dto.OrderDetailDTO;
import org.small.common.utils.CollUtils;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.List;

@Slf4j
@Component
public class ItemClientFallbackFactory implements FallbackFactory<ItemClient> {
    @Override
    public ItemClient create(Throwable cause) {
        return new ItemClient() {
            @Override
            public List<ItemDTO> queryItemByIds(Collection<Long> ids) {
                log.error("查询商品错误",cause);
                return CollUtils.emptyList();
            }

            @Override
            public void deductStock(Collection<OrderDetailDTO> items) {
                log.error("查询商品错误",cause);
            }
        };
    }
}
