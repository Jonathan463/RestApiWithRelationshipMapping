package com.example.springbootrestapiwithrelationshipmapping.Repository;

import com.example.springbootrestapiwithrelationshipmapping.Model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PostRepository extends JpaRepository<Post,Integer> {
List<Post> findAllPost();
Optional<Post> findPostById(int id);
}
