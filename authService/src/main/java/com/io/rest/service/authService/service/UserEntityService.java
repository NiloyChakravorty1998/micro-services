package com.io.rest.service.authService.service;

import com.io.rest.service.authService.dto.UserRequestVO;
import com.io.rest.service.authService.dto.UserResponseVO;
import com.io.rest.service.authService.repository.UserEntityRepository;
import com.io.rest.service.authService.util.ApplicationUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserEntityService {
    @Autowired
    UserEntityRepository userRepo;

    public UserResponseVO saveNewUser(UserRequestVO ivo){
       return ApplicationUtil.convertToResponse(
        userRepo.save(
                ApplicationUtil.convertToEntity(ivo)
        )
       );
    }
}
