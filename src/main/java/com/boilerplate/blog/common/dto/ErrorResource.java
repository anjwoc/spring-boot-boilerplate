package com.boilerplate.blog.common.dto;

import lombok.Getter;

import java.util.Date;

@Getter
public class ErrorResource {
    private final Date timestamp = new Date();
    private final String details;
    private final String message;

    public ErrorResource(String details, String message) {
        this.details = details;
        this.message = message;
    }
}
