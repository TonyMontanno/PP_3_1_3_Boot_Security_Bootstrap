package ru.kata.spring.boot_security.service;

import ru.kata.spring.boot_security.entity.Role;
import ru.kata.spring.boot_security.repository.RoleRepository;

public class RoleServiceImpl implements RoleService {
    private RoleRepository roleRepository;

    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public Role findById(long role_id) {
        return roleRepository.findById(role_id);
    }


}