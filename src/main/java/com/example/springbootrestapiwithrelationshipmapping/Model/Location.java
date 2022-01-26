package com.example.springbootrestapiwithrelationshipmapping.Model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
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

//    public Location(Integer id) {
//        this.id = id;
//    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;

////    @JsonManagedReference
//    public User getUsers() {
//        return users;
//    }
//
//    public void setUsers(User users) {
//        this.users = users;
//    }


    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User users;

}
