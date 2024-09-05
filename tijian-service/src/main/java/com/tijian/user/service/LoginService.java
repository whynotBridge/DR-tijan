package com.tijian.user.service;

import com.tijian.user.pojo.dto.LoginDTO;
import com.tijian.user.pojo.dto.RegisterDTO;

/**
 * @author : rbe
 * @date : 2024/9/5 11:10
 */
public interface LoginService {

    void login(LoginDTO loginDTO);

    void register(RegisterDTO registerDTO);
}
