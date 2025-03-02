package com.rems.boot.mapper;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.rems.boot.entity.QuestionEntity;


public interface QuestionMapper extends BaseMapper<QuestionEntity> {

    boolean deleteBatch(List<Long> ids);

}
