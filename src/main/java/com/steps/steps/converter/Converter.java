package com.steps.steps.converter;

import com.steps.steps.models.UserDTO;
import com.steps.steps.models.UserEntity;

public class Converter {
    public static UserEntity convertUserDTO2UserEntity(UserDTO userDTO) {
        UserEntity userEntity = new UserEntity();
        userEntity.setId(userDTO.getId());
        userEntity.setUsername(userDTO.getUsername());
        userEntity.setPassword(userDTO.getPassword());
        return userEntity;
    }
}
