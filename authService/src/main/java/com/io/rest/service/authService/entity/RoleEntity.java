//package com.io.rest.service.authService.entity;
//
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.NoArgsConstructor;
//
//import javax.persistence.*;
//
//@Entity
//@Builder
//@NoArgsConstructor
//@Table(name = "ROLE_TBL")
//@AllArgsConstructor
//public class RoleEntity {
//    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "role_id_gen")
//    @SequenceGenerator(name = "role_id_gen", sequenceName = "role_id_gen", initialValue = 100)
//    private Long roleId;
//    private String authorisation;
//    @JoinColumn(name = "user_id")
//    private UserEntity user;
//}
