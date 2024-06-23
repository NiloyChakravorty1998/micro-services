package com.io.service.bookService.model.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
public class BaseVO {
    private String responseId;
    private String requestId;
    private Date timeStamp;
    private Exception exception;
}
