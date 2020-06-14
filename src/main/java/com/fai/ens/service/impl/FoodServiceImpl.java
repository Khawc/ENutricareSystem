package com.fai.ens.service.impl;

import com.fai.ens.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodServiceImpl {
    @Autowired private FoodRepository foodRepository;
}
