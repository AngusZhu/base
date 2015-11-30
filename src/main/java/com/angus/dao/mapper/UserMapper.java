package com.angus.dao.mapper;

import com.angus.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Created by Angus on Nov 11,2015.
 */
public interface UserMapper {

    List<User> findAll();

    Page<User> getUserAll(@Param("pageable")Pageable pageable);

    void save(User user);

}
