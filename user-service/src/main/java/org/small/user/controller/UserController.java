package org.small.user.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.small.api.client.ItemClient;
import org.small.api.dto.ItemDTO;
import org.small.user.domain.vo.UserLoginVO;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.small.user.domain.dto.LoginFormDTO;
import org.small.user.service.IUserService;

import java.util.*;

@Api(tags = "用户相关接口")
@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final IUserService userService;

    private final ItemClient itemClient;

    @ApiOperation("用户登录接口")
    @PostMapping("/login")
    public UserLoginVO login(@RequestBody @Validated LoginFormDTO loginFormDTO){
        return userService.login(loginFormDTO);
    }

    @ApiOperation("扣减余额")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pw", value = "支付密码"),
            @ApiImplicitParam(name = "amount", value = "支付金额")
    })
    @PutMapping("/money/deduct")
    public void deductMoney(@RequestParam("pw") String pw,@RequestParam("amount") Integer amount){
        userService.deductMoney(pw, amount);
    }

    @GetMapping("/test")
    public void feignTest(){
        // 1.1.查询商品
        List<Long> ids = new ArrayList<>();
        ids.add(1L);
        List<ItemDTO> items = itemClient.queryItemByIds(ids);
    }
}

