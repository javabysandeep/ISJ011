package com.itshaala.itshaalajobportal.dto;

import com.itshaala.itshaalajobportal.model.Role;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Builder
public class UserDto {
    private int id;
    private String name;
    private String email;
    private String password;
    private Role role;
}
