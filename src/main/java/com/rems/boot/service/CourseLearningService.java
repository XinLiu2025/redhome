package com.rems.boot.service;

import java.util.List;

import com.rems.boot.entity.CourseLearningEntity;


public interface CourseLearningService extends EntityQueryService<CourseLearningEntity, CourseLearningEntity> {

    boolean deleteBatch(List<Long> ids);

}
