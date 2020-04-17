package com.steps.steps.manager;

import com.steps.steps.dao.FlyEntityRepository;
import com.steps.steps.models.entity.FlyEntity;
import com.steps.steps.models.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FlyManager {

    @Autowired
    private FlyEntityRepository flyEntityRepository;

    public void saveFly2DB(FlyEntity flyEntity) {

        flyEntityRepository.save(flyEntity);
    }


    public List<FlyEntity> searchFly(String desde, String hacia) {

        List<FlyEntity> ls = (List<FlyEntity>) flyEntityRepository.findFly(desde,hacia);
        return ls;
    }

    public void changeFly(Long id, Integer seats, Double price) {
        flyEntityRepository.changeFly(id,seats,price);
    }
}