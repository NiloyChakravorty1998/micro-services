package com.io.rest.service.authService.service;

import com.io.rest.service.authService.entity.UserEntity;
import com.io.rest.service.authService.repository.UserEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class AuthUserDetailsService implements UserDetailsService {
    @Autowired
    UserEntityRepository userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity userEntity = userRepo.findByUserName(username)
                .orElseThrow(() -> new UsernameNotFoundException("User not found with username: " + username));
        return User.builder()
                .username(userEntity.getUserName())
                .password(userEntity.getPassword())
                .authorities(new String[]{"USER", "ADMIN"})
                .build();
    }
}
