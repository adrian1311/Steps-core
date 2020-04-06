package com.steps.steps.manager;

import com.steps.steps.dao.FlyEntityRepository;
import com.steps.steps.models.entity.FlyEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FlyManager {

    @Autowired
    private FlyEntityRepository flyEntityRepository;

    public void saveFly2DB(FlyEntity flyEntity) {

        flyEntityRepository.save(flyEntity);
    }



}