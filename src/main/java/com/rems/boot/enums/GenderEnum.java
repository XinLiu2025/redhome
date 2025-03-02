package com.rems.boot.enums;

public enum GenderEnum {

    MALE("男"),
    FEMALE("女"),
    OTHER("其他");

    private String desc;

    GenderEnum(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }
}
