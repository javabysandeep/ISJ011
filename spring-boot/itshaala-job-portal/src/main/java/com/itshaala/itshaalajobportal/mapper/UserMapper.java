package com.itshaala.itshaalajobportal.mapper;

import com.itshaala.itshaalajobportal.dto.UserDto;
import com.itshaala.itshaalajobportal.model.User;

public class UserMapper {
    public static UserDto getUserDto(User user) {
        return UserDto.builder()
                .id(user.getUserId())
                .name(user.getName())
                .email(user.getEmail())
                .password(user.getPassword())
                .role(user.getRole())
                .build();
    }
}
