package com.fai.ens.repository;

import com.fai.ens.entity.Diary;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiaryRepository extends CrudRepository<Diary, Long> {
}
