package com.steps.steps.converter;

import com.steps.steps.models.dto.FlyDTO;
import com.steps.steps.models.entity.FlyEntity;
import com.steps.steps.models.dto.UserDTO;
import com.steps.steps.models.entity.UserEntity;

public class Converter {
    public static UserEntity convertUserDTO2UserEntity(UserDTO userDTO) {
        UserEntity userEntity = new UserEntity();
        userEntity.setId(userDTO.getId());
        userEntity.setUsername(userDTO.getUsername());
        userEntity.setPassword(userDTO.getPassword());
        return userEntity;
    }

    public static FlyEntity convertFlyDTO2FlyEntity(FlyDTO flyDTO) {
        FlyEntity flyEntity = new FlyEntity();
        flyEntity.setFrom_city(flyDTO.getFrom_city());
        flyEntity.setTo_city(flyDTO.getTo_city());
        flyEntity.setSeats(flyDTO.getSeats());
        flyEntity.setPrice(flyDTO.getPrice());
        return flyEntity;
    }
}
