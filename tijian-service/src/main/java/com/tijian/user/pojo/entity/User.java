package com.tijian.user.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * @author : rbe
 * @date : 2024/9/5 11:04
 */
@Data
@TableName("users")
public class User {

    /** 用户编号（手机号码） */
    private String userId;

    /** 密码 */
    private String password;

    /** 真实姓名 */
    private String realName;

    /** 用户性别（1：男；0：女） */
    private Integer sex;

    /** 身份证号 */
    private String identityCard;

    /** 出生日期 */
    private Date birthday;

    /** 用户类型（1：普通用户；2：东软内部员工；3：其他） */
    private Integer userType;
}
