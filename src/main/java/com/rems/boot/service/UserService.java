package com.rems.boot.service;

import java.util.List;

import com.rems.boot.entity.UserEntity;
import com.rems.boot.model.req.ModifyPasswordReq;
import com.rems.boot.model.req.UserQuery;


public interface UserService extends EntityQueryService<UserEntity, UserQuery> {

    boolean deleteBatch(List<Long> ids);

    // 检验用户登录
    UserEntity checkLogin(String username, String password);

    // 修改密码
    boolean modifyPassword(ModifyPasswordReq req);

}
