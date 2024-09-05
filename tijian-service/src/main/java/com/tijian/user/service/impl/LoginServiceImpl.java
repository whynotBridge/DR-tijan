package com.tijian.user.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.tijian.exception.TijianException;
import com.tijian.user.mapper.UserMapper;
import com.tijian.user.pojo.dto.LoginDTO;
import com.tijian.user.pojo.dto.RegisterDTO;
import com.tijian.user.pojo.entity.User;
import com.tijian.user.service.LoginService;
import jakarta.annotation.Resource;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

/**
 * @author : rbe
 * @date : 2024/9/5 11:11
 */
@Service
public class LoginServiceImpl implements LoginService {

    @Resource
    private UserMapper userMapper;

    @Override
    public void login(LoginDTO loginDTO){
        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<>();

        wrapper.eq(User::getUserId, loginDTO.getPhoneNumber())
                .eq(User::getPassword, loginDTO.getPassword());

        User user = userMapper.selectOne(wrapper);

        if(user == null){
            throw new TijianException("用户名或密码错误");
        }
    }

    @Override
    public void register(RegisterDTO registerDTO){
        preCheck(registerDTO);

        User user = new User();
        BeanUtils.copyProperties(registerDTO, user);
        user.setUserId(registerDTO.getPhoneNumber());

        int insert = userMapper.insert(user);
        if(insert < 1){
            throw new TijianException("注册失败");
        }
    }

    private void preCheck(RegisterDTO registerDTO) {
        if(registerDTO.getPhoneNumber().length() != 11){
            throw new TijianException("手机号长度不正确");
        }

        if(registerDTO.getIdentityCard().length()!=18){
            throw new TijianException("身份证长度不正确");
        }
    }
}
