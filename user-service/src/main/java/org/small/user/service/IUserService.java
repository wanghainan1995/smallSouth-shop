package org.small.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.small.user.domain.po.User;
import org.small.user.domain.vo.UserLoginVO;
import org.small.user.domain.dto.LoginFormDTO;

/**
 * <p>
 * 用户表 服务类
 * </p>
 */
public interface IUserService extends IService<User> {

    UserLoginVO login(LoginFormDTO loginFormDTO);

    void deductMoney(String pw, Integer totalFee);
}
