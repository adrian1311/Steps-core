package com.steps.steps.manager;

import com.steps.steps.dao.UserEntityRepository;
import com.steps.steps.models.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserManager {

    @Autowired
    private UserEntityRepository userEntityRepository;

    public void saveUser2DB(UserEntity user) {

        userEntityRepository.save(user);
    }
    public void deleteUser2DB(UserEntity user) {

        userEntityRepository.delete(user);
    }

    public List<UserEntity> findAll() {

        List<UserEntity> ls = (List<UserEntity>) userEntityRepository.findAll();
        return ls;
    }
}
