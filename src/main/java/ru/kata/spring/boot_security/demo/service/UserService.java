package ru.kata.spring.boot_security.demo.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import ru.kata.spring.boot_security.demo.entity.Role;
import ru.kata.spring.boot_security.demo.entity.User;

import java.util.List;

public interface UserService extends UserDetailsService {
    void addOrUpdateUser(User user);

    List<User> findAll();

    User getUserById(Long id);

    void deleteById(User user);

    User findByUsername(String username);

    List<Role> listRoles();
    UserDetails loadUserByUsername(String username);

}