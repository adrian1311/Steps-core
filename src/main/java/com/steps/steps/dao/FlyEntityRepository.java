package com.steps.steps.dao;

import com.steps.steps.models.entity.FlyEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlyEntityRepository extends CrudRepository<FlyEntity, String> {

}
