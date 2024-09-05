package com.tijian.user.pojo.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * @author : rbe
 * @date : 2024/9/5 11:19
 */
@Data
public class LoginDTO {

    @Schema(description = "手机号码")
    private String phoneNumber;

    @Schema(description = "密码")
    private String password;
}
