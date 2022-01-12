package com.example.springbootrestapiwithrelationshipmapping.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Post {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer id;
    private LocalDateTime postDate;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    private String details;
}
