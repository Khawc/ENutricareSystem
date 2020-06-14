package com.fai.ens.service.impl;

import com.fai.ens.repository.DiaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DiaryServiceImpl {
    @Autowired
    private DiaryRepository diaryRepository;
}
