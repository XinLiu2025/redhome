package com.rems.boot.enums;

import lombok.Getter;

@Getter
public enum LayCodeEnum {

    // 成功状态码,
    SUCCESS(0, "success"),
    // 错误状态码
    ERROR(1, "error");

    private final int code;
    private final String desc;

    LayCodeEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

}
