package org.small.api.client.fallback;

import lombok.extern.slf4j.Slf4j;
import org.small.api.client.UserClient;
import org.springframework.cloud.openfeign.FallbackFactory;
@Slf4j
public class UserClientFallbackFactory implements FallbackFactory<UserClient> {
    @Override
    public UserClient create(Throwable cause) {
        return new UserClient() {
            @Override
            public void deductMoney(String pw, Integer amount) {
                log.error("扣减库存失败");
                throw new RuntimeException(cause);
            }
        };
    }
}
