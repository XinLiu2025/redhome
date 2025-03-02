package com.rems.boot.model.req;

import lombok.Data;


@Data
public class ModifyPasswordReq {

    /**
     * 用户id
     */
    private Integer userId;
    /**
     * 旧密码
     */
    private String oldPassword;
    /**
     * 新密码
     */
    private String password;

}
