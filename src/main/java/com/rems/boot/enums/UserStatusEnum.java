package com.rems.boot.enums;

public enum UserStatusEnum {
    ACTIVE("激活"),
    INACTIVE("未激活"),
    PENDING("待审核");


    private String desc;


    UserStatusEnum(String desc) {
        this.desc = desc;
    }

}
