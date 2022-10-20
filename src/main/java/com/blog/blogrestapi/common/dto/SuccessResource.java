package com.blog.blogrestapi.common.dto;

import lombok.Builder;
import lombok.Getter;

@Getter @Builder
public class SuccessResource {
    protected Object data;
}
