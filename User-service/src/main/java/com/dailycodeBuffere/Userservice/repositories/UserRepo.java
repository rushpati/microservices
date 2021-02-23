package com.dailycodeBuffere.Userservice.repositories;

import com.dailycodeBuffere.Userservice.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {


}
