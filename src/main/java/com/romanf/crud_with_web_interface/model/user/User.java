package com.romanf.crud_with_web_interface.model.user;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "user", schema = "public")
public class User {

    @Id
    @GeneratedValue(generator = "user_id_seq", strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;

    private String lastName;
}
