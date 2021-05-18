package com.zacpez.sampledocker.controller;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

import com.zacpez.sampledocker.exceptions.UserNotFoundException;
import com.zacpez.sampledocker.dto.mapper.UserDto;
import com.zacpez.sampledocker.model.User;
import com.zacpez.sampledocker.model.UserRepository;


@RestController
@RequiredArgsConstructor
public class UserController {
  
  private final UserRepository userRepository;

  @PostMapping("/users")
  public void postUser(@RequestBody UserDto userDto) {
    User user = new User();
    user.setFirstName(userDto.getFirstName());
    user.setLastName(userDto.getLastName());
    user.setAge(userDto.getAge());
    userRepository.save(user);
  }

  @PutMapping("/users/{id}")
  public void putUser(@PathVariable long id, @RequestBody UserDto userDto) {
    User user = new User();
    user.setId(id);
    user.setFirstName(userDto.getFirstName());
    user.setLastName(userDto.getLastName());
    user.setAge(userDto.getAge());
    userRepository.save(user);
  }

  @DeleteMapping("/users/{id}")
  public void deleteUser(@PathVariable long id) {
    userRepository.deleteById(id);
  }

  @GetMapping("/users/{id}")
  public User getUser(@PathVariable long id) {
      return userRepository
            .findById(id)
            .orElseThrow(UserNotFoundException::new);
  }

  @GetMapping("/users")
  public List<User> getStudents() {
      return userRepository.findAll();
  }
}