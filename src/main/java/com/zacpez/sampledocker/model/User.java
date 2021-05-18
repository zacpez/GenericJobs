package com.zacpez.sampledocker.model;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="\"user\"")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private Integer age;
    private Integer notAge;
}
