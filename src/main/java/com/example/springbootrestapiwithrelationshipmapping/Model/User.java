package com.example.springbootrestapiwithrelationshipmapping.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class User {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer id;
    private String firstname;
    private String lastname;

    @OneToMany(mappedBy = "user")
    private List<Post> posts;

    @ManyToOne
    @JoinColumn(name = "location_id")
    private Location location;
    private String email;
}
