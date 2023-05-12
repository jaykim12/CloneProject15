package com.example.cloneproject15.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class UserRequestDto {
    private String userid;
    private String username;
    private String password;
    private String category;
    private String image_url;
}