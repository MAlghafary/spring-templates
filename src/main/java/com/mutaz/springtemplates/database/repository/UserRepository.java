package com.mutaz.springtemplates.database.repository;

import com.mutaz.springtemplates.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface UserRepository extends JpaRepository<User,String> {

    User findByUsername(String userName);
}
