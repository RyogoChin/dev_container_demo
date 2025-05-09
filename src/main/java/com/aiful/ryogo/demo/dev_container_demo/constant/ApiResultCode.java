package com.aiful.ryogo.demo.dev_container_demo.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ApiResultCode {

    SUCCESS("00000", "SUCCESS"),
    BIZ_ERROR("40000", "BUSINESS_ERROR"),
    SYS_ERROR("90000", "SYSTEM_ERROR");

    private final String code;
    private final String message;

}
