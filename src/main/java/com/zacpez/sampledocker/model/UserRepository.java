package com.zacpez.sampledocker.model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.zacpez.sampledocker.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}