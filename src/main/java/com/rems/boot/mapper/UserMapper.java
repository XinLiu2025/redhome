package com.rems.boot.mapper;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.rems.boot.entity.UserEntity;

public interface UserMapper extends BaseMapper<UserEntity> {

    boolean deleteBatch(List<Long> ids);
}
