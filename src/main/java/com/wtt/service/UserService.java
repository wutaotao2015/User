package com.wtt.service;

import com.wtt.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by wutaotao
 * 2018/1/6 22:37
 */

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

}
