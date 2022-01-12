package com.example.springbootrestapiwithrelationshipmapping.Services;

import com.example.springbootrestapiwithrelationshipmapping.Model.Post;

import java.util.List;
import java.util.Optional;


public interface PostService {
    Post addPost(Post post);
    List<Post> getAllPost();
    Optional<Post> findPostById(Integer id);

}
