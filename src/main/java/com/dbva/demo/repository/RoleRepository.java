package com.dbva.demo.repository;

import com.dbva.demo.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoleRepository extends JpaRepository<Role, Long> {
    List<Role> findByNameContainingIgnoreCase(String name);
}