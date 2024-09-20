package org.small.api.Interceptor;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.small.common.utils.UserContext;


public class UserInfoInterceptor implements RequestInterceptor {
    @Override
    public void apply(RequestTemplate requestTemplate) {
        Long userId = UserContext.getUser();
        if (userId!=null) {
            requestTemplate.header("user-info", userId.toString());
        }
    }
}
