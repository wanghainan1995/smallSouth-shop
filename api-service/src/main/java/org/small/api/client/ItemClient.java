package org.small.api.client;

import org.small.api.client.fallback.ItemClientFallbackFactory;
import org.small.api.dto.ItemDTO;
import org.small.api.dto.OrderDetailDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;
import java.util.List;

@FeignClient(value = "item-service",fallbackFactory = ItemClientFallbackFactory.class)
public interface ItemClient {
    @GetMapping("/items")
    public List<ItemDTO> queryItemByIds(@RequestParam("ids") Collection<Long> ids) ;

    @PutMapping(value = "/items/stock/deduct")
    public void deductStock(@RequestBody Collection<OrderDetailDTO> items);
}
