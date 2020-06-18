package com.fai.ens.repository;

import com.fai.ens.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserRepository extends CrudRepository<User,Integer> {
    List<User> findAll();

}
