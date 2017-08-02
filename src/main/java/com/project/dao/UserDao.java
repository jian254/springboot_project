package com.project.dao;


import com.project.entiy.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by jian on 17/8/2.
 */
public interface UserDao extends JpaRepository<User, Long> {
}
