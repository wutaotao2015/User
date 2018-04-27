package com.wtt.repository;

import com.wtt.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by wutaotao
 * 2018/1/6 00:38
 */
public interface UserRepository extends JpaRepository<User, Integer>{

    User findByUsername(String username);
}
