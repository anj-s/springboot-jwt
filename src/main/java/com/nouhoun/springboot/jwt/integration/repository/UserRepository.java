package com.nouhoun.springboot.jwt.integration.repository;

import com.nouhoun.springboot.jwt.integration.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by nydiarra on 06/05/17.
public interface UserRepository extends CrudRepository<User, Long>, PagingAndSortingRepository<User, Long> {
    // This method finds a user by their username
    User findByUsername(String username);
    User findByUsername(String username);
}