package com.dailycodebuffer.jwt.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class JwtRequest {

    @Id
    private Long id;
    private String username;
    private String password;
}
