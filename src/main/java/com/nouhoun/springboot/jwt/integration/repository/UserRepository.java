package com.nouhoun.springboot.jwt.integration.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import com.nouhoun.springboot.jwt.integration.domain.User;

/**
 * Created by nydiarra on 06/05/17.
 */
public interface UserRepository extends CrudRepository<User, Long> {\n    User findByUsername(String username);\n}
    User findByUsername(String username);
}