package com.example.dockerstudy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.ToString;

@Entity
@Table(name = "USER")
@Getter
@ToString
public class User {

    @Id
    @Column(name = "INDEX")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer index;

    @Column(name = "ID")
    private String id;

    @Column(name = "PASSWORD")
    private String password;
}
