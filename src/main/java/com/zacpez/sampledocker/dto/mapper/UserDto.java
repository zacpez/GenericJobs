package com.zacpez.sampledocker.dto.mapper;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import lombok.NoArgsConstructor;
import lombok.ToString;
import javax.persistence.Id;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@Getter
@Setter
@Accessors(chain = true)
@NoArgsConstructor
@ToString
@JsonInclude(value = JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserDto {
    @Id
    private Long id;
    private String firstName;
    private String lastName;
    private int age;
}