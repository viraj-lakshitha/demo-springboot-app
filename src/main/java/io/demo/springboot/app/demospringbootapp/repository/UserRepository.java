package io.demo.springboot.app.demospringbootapp.repository;

import io.demo.springboot.app.demospringbootapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> { }