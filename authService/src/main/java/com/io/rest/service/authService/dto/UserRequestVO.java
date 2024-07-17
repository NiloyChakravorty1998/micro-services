package com.io.rest.service.authService.dto;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class UserRequestVO {
    private String emailId;
    private String userName;
    private String password;
}
