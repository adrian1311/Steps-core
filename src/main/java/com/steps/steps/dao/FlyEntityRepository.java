package com.steps.steps.dao;

import com.steps.steps.models.entity.FlyEntity;
import com.steps.steps.models.entity.UserEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FlyEntityRepository extends CrudRepository<FlyEntity, String> {

    @Query(value = "SELECT * FROM flys WHERE from_city = :desde and to_city = :hacia", nativeQuery = true)
    List<FlyEntity> findFly(@Param("desde") String desde, @Param("hacia") String hacia);

}
