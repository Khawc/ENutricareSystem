package com.fai.ens.service.impl;

import com.fai.ens.repository.UserRepository;
import com.fai.ens.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private  UserRepository userRepository;


}
