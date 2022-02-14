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
    private String lastName;
    private String userName;
    private String email;
    private String location;

}
