package com.steps.steps.dao;




import com.steps.steps.models.UserEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserEntityRepository extends CrudRepository<UserEntity, String> {

    @Query(value = "SELECT * FROM users WHERE username = :username", nativeQuery = true)
    UserEntity findByUsername(@Param("username") String username);

}