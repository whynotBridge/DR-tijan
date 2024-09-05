package com.tijian.controller.user;

import com.tijian.pojo.Result;
import com.tijian.user.pojo.dto.LoginDTO;
import com.tijian.user.pojo.dto.RegisterDTO;
import com.tijian.user.service.LoginService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : rbe
 * @date : 2024/9/5 11:01
 */
@RestController
@Tag(name = "用户登录")
public class LoginController {

    @Resource
    private LoginService loginService;

    @Operation(summary = "用户登录")
    @PostMapping("/login")
    public Result<?> login(@RequestBody LoginDTO loginDTO){
        loginService.login(loginDTO);
        return Result.success("登录成功！");
    }

    @Operation(summary = "用户注册")
    @PostMapping("/register")
    public Result<?> register(@RequestBody RegisterDTO registerDTO){
        loginService.register(registerDTO);
        return Result.success("注册成功！");
    }

    @Operation(summary ="用户退出")
    @PostMapping("/logout")
    public Result<?> logout(){
        return Result.success("退出成功！");
    }
}
