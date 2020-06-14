package com.fai.ens.service.impl;

import com.fai.ens.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl {
    @Autowired
    private CommentRepository commentRepository;

}
