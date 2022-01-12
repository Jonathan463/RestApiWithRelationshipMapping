package com.example.springbootrestapiwithrelationshipmapping.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)



    private Integer id;
    private String name;
    @OneToMany(mappedBy = "location")
    private List<User> users;
}
