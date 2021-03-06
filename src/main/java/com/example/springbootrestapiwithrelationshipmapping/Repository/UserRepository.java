package com.example.springbootrestapiwithrelationshipmapping.Repository;

import com.example.springbootrestapiwithrelationshipmapping.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
   //@Query("Select u.firstname, u.lastname, u.email from User u where u.location.id=:id")
    @Query(value = "SELECT firstname FROM users WHERE location_id=?", nativeQuery = true)
    Optional<User> findAllUserByLocationId(Integer locationId);
    //List<User> findAllByLocation_Id(Integer id);

Optional<User> findUserById(int id);
//Optional<User> findUserByLocation
}
