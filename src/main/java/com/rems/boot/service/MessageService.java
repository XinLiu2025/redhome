package com.rems.boot.service;

import java.util.List;

import com.rems.boot.entity.MessageEntity;

public interface MessageService extends EntityQueryService<MessageEntity, MessageEntity> {

    boolean deleteBatch(List<Long> ids);

}
