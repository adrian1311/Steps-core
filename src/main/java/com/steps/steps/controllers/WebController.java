package com.steps.steps.controllers;

import com.steps.steps.converter.Converter;

import com.steps.steps.manager.UserManager;
import com.steps.steps.models.UserDTO;
import com.steps.steps.models.UserEntity;
import org.hibernate.NonUniqueResultException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


@RestController
@CrossOrigin
@RequestMapping(value = "/api")
public class WebController {
    Logger LOGGER = LoggerFactory.getLogger(WebController.class);
    private List<UserEntity> allUsers = new ArrayList<UserEntity>();

    @Autowired
    private UserManager userManager;

    @RequestMapping(value = "/createUser", consumes = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
    @Transactional
    public void createUser(@RequestBody UserDTO userDTO) {
        try {
            LOGGER.info("Begin creating a new user.");
            UserEntity userEntity = Converter.convertUserDTO2UserEntity(userDTO);
            userManager.saveUser2DB(userEntity);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @RequestMapping(value = "/readAllUsers", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    public List<UserEntity> readAllUsers() {

        List<UserEntity> list = (List<UserEntity>) userManager.findAll();
        return list;
    }
}
