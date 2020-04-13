package com.steps.steps.controllers;

import com.steps.steps.converter.Converter;

import com.steps.steps.manager.FlyManager;
import com.steps.steps.manager.UserManager;
import com.steps.steps.models.dto.FlyDTO;
import com.steps.steps.models.entity.FlyEntity;
import com.steps.steps.models.dto.UserDTO;
import com.steps.steps.models.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.ArrayList;
import java.util.List;


@RestController
@CrossOrigin("*")
@RequestMapping(value = "/api")
public class WebController {
    Logger LOGGER = LoggerFactory.getLogger(WebController.class);
    private List<UserEntity> allUsers = new ArrayList<UserEntity>();

    @Autowired
    private UserManager userManager;
    @Autowired
    private FlyManager flyManager;

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
    @RequestMapping(value = "/deleteUser", consumes = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
    @Transactional
    public void deleteUser(@RequestBody UserDTO userDTO) {

        LOGGER.info("Delete user from BD");
        UserEntity userEntity = Converter.convertUserDTO2UserEntity(userDTO);
        userManager.deleteUser2DB(userEntity);
    }

    @RequestMapping(value = "/readAllUsers", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    public List<UserEntity> readAllUsers() {

        LOGGER.info("Trying to show all users.");
        List<UserEntity> list = (List<UserEntity>) userManager.findAll();
        return list;
    }

    @RequestMapping(value = "/createFly", consumes = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
    @Transactional
    public void createFly(@RequestBody FlyDTO flyDTO) {
        try {
            LOGGER.info("Begin creating a new fly");
            FlyEntity flyEntity = Converter.convertFlyDTO2FlyEntity(flyDTO);
            flyManager.saveFly2DB(flyEntity);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @RequestMapping(value = "/searchFly", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
    @Transactional
    public List<FlyEntity> searchFly(@RequestBody FlyDTO flyDTO) {

            LOGGER.info("Searching....");
            FlyEntity flyEntity = Converter.convertFlyDTO2FlyEntity(flyDTO);
            List<FlyEntity> list = (List<FlyEntity>) flyManager.searchFly(flyEntity.getFrom_city(),flyEntity.getTo_city());
        LOGGER.info(list.toString());
            return list;
    }

}
