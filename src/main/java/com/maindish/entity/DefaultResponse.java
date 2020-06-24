package com.maindish.entity;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class DefaultResponse {
    private Result result;
    private Error error;
    private Object data;
}