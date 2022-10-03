package ru.kata.spring.boot_security.service;

import ru.kata.spring.boot_security.entity.Role;

public interface RoleService {
    Role findById(long role_id);
}