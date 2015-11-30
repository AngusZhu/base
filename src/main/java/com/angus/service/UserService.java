package com.angus.service;

import com.angus.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Created by Angus on Nov 11,2015.
 */
public interface UserService {

    User getUser(Long id);

    Page<User> getAll(Pageable pageable);

    List<User> getUserList();

    Page<User> getUserAll(Pageable pageable);

    void save();

    void saveUser();

}
