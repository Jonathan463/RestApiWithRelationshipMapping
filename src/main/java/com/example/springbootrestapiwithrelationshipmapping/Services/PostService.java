package com.example.springbootrestapiwithrelationshipmapping.Services;

import com.example.springbootrestapiwithrelationshipmapping.Model.Post;


public interface PostService {
    Post addPost(Post post);
    Post getAllPost();
    Post findPostById(Integer id);

}
