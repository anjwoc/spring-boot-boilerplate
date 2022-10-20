package com.boilerplate.blog.common.dto;

import lombok.Builder;
import lombok.Getter;

@Getter @Builder
public class SuccessResource {
    protected Object data;
}
