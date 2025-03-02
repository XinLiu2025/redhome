package com.rems.boot.service;

import java.util.List;

import com.rems.boot.entity.QuestionEntity;


public interface QuestionService extends EntityQueryService<QuestionEntity, QuestionEntity> {

    boolean deleteBatch(List<Long> ids);

}
