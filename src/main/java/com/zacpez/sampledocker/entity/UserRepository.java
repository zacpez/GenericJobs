package com.zacpez.sampledocker.entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.zacpez.sampledocker.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}