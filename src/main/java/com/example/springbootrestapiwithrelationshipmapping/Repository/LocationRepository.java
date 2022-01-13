package com.example.springbootrestapiwithrelationshipmapping.Repository;

import com.example.springbootrestapiwithrelationshipmapping.Model.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LocationRepository extends JpaRepository<Location,Integer> {
List<Location> findAllLocation();
Optional<Location> findLocationById(int id);
}
