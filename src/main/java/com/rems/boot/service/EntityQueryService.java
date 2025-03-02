package com.rems.boot.service;

import java.util.List;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;


public interface EntityQueryService<T, Q extends T> extends EntityService<T> {

    List<T> list(Q query);

    Page<T> page(Q query, Page<T> page);

}
