package com.steps.steps.manager;

import com.steps.steps.dao.UserEntityRepository;
import com.steps.steps.models.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserManager {

    @Autowired
    private UserEntityRepository userEntityRepository;

    public void saveUser2DB(UserEntity user) {

        userEntityRepository.save(user);
    }
}
