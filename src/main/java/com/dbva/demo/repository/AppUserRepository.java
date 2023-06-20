package com.dbva.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbva.demo.model.AppUser;

public interface AppUserRepository extends JpaRepository<AppUser, Long> {
    List<AppUser> findByNameSetContainingIgnoreCase(String nameSet);
}