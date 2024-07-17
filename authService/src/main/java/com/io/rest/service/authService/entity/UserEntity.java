package com.io.rest.service.authService.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@Table(name = "USRS_TBL")
@Builder
@AllArgsConstructor
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usr_id_gen")
    @SequenceGenerator(name = "usr_id_gen", sequenceName = "usr_id_gen", initialValue = 100)
    private Long userId;
    @Column(name = "email_address")
    private String emailId;
    private String userName;
    private String password;

//    @OneToMany(fetch = FetchType.EAGER, mappedBy = "user")
//    private Set<RoleEntity> roles;
}
