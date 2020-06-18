package com.fai.ens.repository;

import com.fai.ens.entity.DiaryDetail;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiaryDetailRepository extends CrudRepository<DiaryDetail, Integer> {
}
