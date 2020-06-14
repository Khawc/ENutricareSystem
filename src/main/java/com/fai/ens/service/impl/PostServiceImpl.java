package com.fai.ens.service.impl;

import com.fai.ens.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl {
    @Autowired
    private PostRepository postRepository;
}
