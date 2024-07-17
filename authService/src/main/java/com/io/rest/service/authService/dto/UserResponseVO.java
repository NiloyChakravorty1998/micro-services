package com.io.rest.service.authService.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class UserResponseVO {
    private Long userId;
    private String emailId;
    private String userName;
}
