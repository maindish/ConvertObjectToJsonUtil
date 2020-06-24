package com.maindish.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
//@JsonAutoDetect(fieldVisibility= JsonAutoDetect.Visibility.ANY)
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum Result {
    SUCCESS(0, "SUCCESS"),
    INVALID_ID_INPUT_VALUE(1000, "INVALID_ID_INPUT_VALUE"),
    INTERNAL_SERVER_ERROR(5000, "INTERNAL_SERVER_ERROR");

    private int code;
    private String message;
}
