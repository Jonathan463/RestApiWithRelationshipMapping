package com.example.springbootrestapiwithrelationshipmapping.Controllers;

import com.example.springbootrestapiwithrelationshipmapping.Model.Post;
import com.example.springbootrestapiwithrelationshipmapping.Services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
public class PostController {


    private PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("post")
    List<Post> getAllPost(){
         List<Post> postList = postService.getAllPost();
        return postList;
    }

    @GetMapping("post/{id}")
    Optional<Post> findPostById(@PathVariable(value = "id") int id){

        return postService.findPostById(id);
    }

    @PostMapping("addPost")
    Post addPost(Post post){
       return postService.addPost(post);
    }

}
