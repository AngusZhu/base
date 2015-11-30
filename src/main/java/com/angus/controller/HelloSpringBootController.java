package com.angus.controller;

import com.angus.entity.User;
import com.angus.service.UserService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Angus on Nov 8,2015.
 */
@Controller
@RequestMapping("/")
public class HelloSpringBootController {

    private final static Log log = LogFactory.getLog(HelloSpringBootController.class);

    @Autowired
    private UserService userService;

    @Transactional
    @RequestMapping("/")
    @ResponseBody
    public String sayHello(Pageable pageable){

        Page<User> all = userService.getAll(pageable);

        User user = userService.getUser(1L);

        List<User> userList = userService.getUserList();

        Page<User> allList = userService.getUserAll(pageable);

        System.out.println(all.getTotalPages());
        System.out.println(user.getId());
        System.out.println(userList.get(0).getId());
        System.out.println(allList.getTotalPages());

        userService.save();
        userService.saveUser();

        return "hello SpringBoot! -- userId:";
    }

}
