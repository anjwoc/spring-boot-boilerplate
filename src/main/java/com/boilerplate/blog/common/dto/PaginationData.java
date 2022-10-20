package com.boilerplate.blog.common.dto;

import lombok.Getter;

@Getter
public class PaginationData {
    private final int currentPage;
    private final int perPage;
    private final int total;
    private final int totalPage;
    private final boolean isLast;

    public PaginationData(int currentPage, int perPage, int total, int totalPage, boolean isLast) {
        this.currentPage = currentPage;
        this.perPage = perPage;
        this.total = total;
        this.totalPage = totalPage;
        this.isLast = isLast;
    }
}
