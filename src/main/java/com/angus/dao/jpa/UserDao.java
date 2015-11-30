package com.angus.dao.jpa;

import com.angus.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Angus on Nov 12,2015.
 */
@Repository
public interface UserDao extends JpaRepository<User, Long> {

    Page<User> findAll(Pageable pageable);

}
