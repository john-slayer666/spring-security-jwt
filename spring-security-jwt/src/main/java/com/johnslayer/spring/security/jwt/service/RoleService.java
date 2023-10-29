package com.johnslayer.spring.security.jwt.service;

import com.johnslayer.spring.security.jwt.entities.Role;
import com.johnslayer.spring.security.jwt.repositories.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RoleService {
    private final RoleRepository roleRepository;

    public Role getUserRole() {
        return roleRepository.findByName("ROLE_USER").get();
    }
}
