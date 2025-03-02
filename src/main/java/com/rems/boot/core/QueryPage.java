package com.rems.boot.core;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class QueryPage {

    /**
     * 页数
     */
    private Integer pageIndex = 1;
    /**
     * 每页条数
     */
    private Integer pageSize = 10;
    /**
     * 总数
     */
    private Long totalCount;

}
