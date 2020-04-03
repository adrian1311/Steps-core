package com.steps.steps.controllers;

import com.steps.steps.converter.Converter;

import com.steps.steps.manager.UserManager;
import com.steps.steps.models.UserDTO;
import com.steps.steps.models.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin
@RequestMapping(value = "/api")
public class WebController {

    @Autowired
    private UserManager userManager;

    @RequestMapping(value = "/createUser", consumes = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
    @Transactional
    public void createUser(@RequestBody UserDTO userDTO) {
        try {
            UserEntity userEntity = Converter.convertUserDTO2UserEntity(userDTO);
            userManager.saveUser2DB(userEntity);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
