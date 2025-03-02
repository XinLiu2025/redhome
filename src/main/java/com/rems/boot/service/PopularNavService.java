package com.rems.boot.service;

import java.util.List;

import com.rems.boot.entity.PopularNavEntity;


public interface PopularNavService extends EntityQueryService<PopularNavEntity, PopularNavEntity> {

    boolean deleteBatch(List<Long> ids);

    boolean clickUpdate(Integer id);

}
