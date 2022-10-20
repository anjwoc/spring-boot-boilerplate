package com.blog.blogrestapi.common.dto;

import lombok.Builder;
import lombok.Getter;

@Getter @Builder
public class PaginationResource<T> {
    protected T data;
    protected PaginationData pagination;
}
