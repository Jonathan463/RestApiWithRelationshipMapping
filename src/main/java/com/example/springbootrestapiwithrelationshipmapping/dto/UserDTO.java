package com.example.springbootrestapiwithrelationshipmapping.dto;

import com.example.springbootrestapiwithrelationshipmapping.Model.Location;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private String firstname;
    private String lastname;
    private String username;
    private String email;
    private String location;

}
