package com.maindish.entity;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class Error {
    private String message;

    public Error(Exception exception) {
        this.message = exception.getMessage();
    }
}
