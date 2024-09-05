package com.tijian.user.pojo.dto;

import lombok.Data;

import java.util.Date;

/**
 * @author : rbe
 * @date : 2024/9/5 12:15
 */
@Data
public class RegisterDTO {

    private String phoneNumber;

    private String password;

    private String realName;

    private Integer sex;

    private String identityCard;

    private Date birthday;

    private Integer userType;

}
