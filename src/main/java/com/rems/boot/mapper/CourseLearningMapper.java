package com.rems.boot.mapper;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.rems.boot.entity.CourseLearningEntity;


public interface CourseLearningMapper extends BaseMapper<CourseLearningEntity> {

    boolean deleteBatch(List<Long> ids);

}
