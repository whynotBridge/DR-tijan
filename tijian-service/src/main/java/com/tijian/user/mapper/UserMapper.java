package com.tijian.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tijian.user.pojo.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author : rbe
 * @date : 2024/9/5 11:08
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
