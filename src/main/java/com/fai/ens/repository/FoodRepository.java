package com.fai.ens.repository;

import com.fai.ens.entity.Food;
import com.fai.ens.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodRepository extends CrudRepository<Food,Long> {
}
