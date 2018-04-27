package com.wtt.contrller;

import com.wtt.domain.Result;
import com.wtt.domain.User;
import com.wtt.repository.UserRepository;
import com.wtt.service.UserService;
import com.wtt.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by wutaotao
 * 2018/1/5
 */
@RestController
public class UserController extends Cors{

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

    @GetMapping(value = "/users")
    public List<User> getUsers(){
        return userRepository.findAll();
    }

    @GetMapping(value = "/user/{id}")
    public User getUserById(@PathVariable Integer id){
        return userRepository.findOne(id);
    }

    @PostMapping(value = "/login")
    public Result login(@RequestBody User paramUser){

        User user = userRepository.findByUsername(paramUser.getUsername());
        if (user != null && user.getPassword().equals(paramUser.getPassword())) {
            return ResultUtil.success(user);
        }else {
            return ResultUtil.error(888, "no user");
        }
    }
}
