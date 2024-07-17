package com.io.rest.service.authService.util;

import com.io.rest.service.authService.dto.UserRequestVO;
import com.io.rest.service.authService.dto.UserResponseVO;
import com.io.rest.service.authService.entity.UserEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class ApplicationUtil {

    private static final PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public static UserEntity convertToEntity(UserRequestVO ivo) {
        return UserEntity.builder()
                .emailId(ivo.getEmailId())
                .userName(ivo.getUserName())
                .password(passwordEncoder.encode(ivo.getPassword()))
                .build();
    }

    public static UserResponseVO convertToResponse(UserEntity entity) {
        return UserResponseVO.builder()
                .userId(entity.getUserId())
                .emailId(entity.getEmailId())
                .userName(entity.getUserName())
                .build();
    }
}
