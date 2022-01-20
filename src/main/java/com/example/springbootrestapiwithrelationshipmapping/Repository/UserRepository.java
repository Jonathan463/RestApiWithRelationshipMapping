package com.example.springbootrestapiwithrelationshipmapping.Repository;

import com.example.springbootrestapiwithrelationshipmapping.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
Optional<User>  findUserByLocationId(int id);
Optional<User> findUserById(int id);
//Optional<User> findUserByLocation
}
