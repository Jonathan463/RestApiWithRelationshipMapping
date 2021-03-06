package com.example.springbootrestapiwithrelationshipmapping.dto;

import com.example.springbootrestapiwithrelationshipmapping.Model.Location;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private String firstName;
    private String LastName;
    private String userName;
    private String email;
    private String location;

}
