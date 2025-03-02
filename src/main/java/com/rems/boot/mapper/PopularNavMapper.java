package com.rems.boot.mapper;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.rems.boot.entity.PopularNavEntity;

public interface PopularNavMapper extends BaseMapper<PopularNavEntity> {

    boolean deleteBatch(List<Long> ids);

}
