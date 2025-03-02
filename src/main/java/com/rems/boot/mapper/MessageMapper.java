package com.rems.boot.mapper;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.rems.boot.entity.MessageEntity;

public interface MessageMapper extends BaseMapper<MessageEntity> {


    boolean deleteBatch(List<Long> ids);
}
