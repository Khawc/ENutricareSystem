package com.fai.ens.service.impl;

import com.fai.ens.repository.DiaryDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DiaryDetailServiceImpl {
    @Autowired private DiaryDetailRepository diaryDetailRepository;
}
