package com.rems.boot.model.req;

import com.rems.boot.entity.UserEntity;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserQuery extends UserEntity {

    /**
     * 是否是管理员
     */
    private Boolean isAdmin = false;

}
