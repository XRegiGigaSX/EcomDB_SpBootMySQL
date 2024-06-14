package com.rayyanshaikh.ecom.dto;

import com.rayyanshaikh.ecom.enums.UserRole;
import lombok.Data;

@Data
public class UserDto {
    private Long id;
    private String email;
    private String name;

    private UserRole userRole;

}
