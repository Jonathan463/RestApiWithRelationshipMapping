package com.example.springbootrestapiwithrelationshipmapping.ServiceImpl;

import com.example.springbootrestapiwithrelationshipmapping.Model.Post;
import com.example.springbootrestapiwithrelationshipmapping.Repository.PostRepository;
import com.example.springbootrestapiwithrelationshipmapping.Services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostServiceImpl implements PostService {

    private PostRepository postRepository;

    @Autowired
    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }



    @Override
    public Post addPost(Post post) {
        return postRepository.save(post);
    }

    @Override
    public List<Post> getAllPost() {
        return postRepository.findAllPost();
    }

    @Override
    public Optional<Post> findPostById(Integer id) {
        return postRepository.findPostById(id);
    }
}
