package io.demo.springboot.app.demospringbootapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table( name = "user_details")
public class User {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private long userId;
    private String userName;
    private String userEmail;
}
