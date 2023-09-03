package com.dbva.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbva.demo.model.AppUser;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface AppUserRepository extends JpaRepository<AppUser, Long>, JpaSpecificationExecutor<AppUser> {
    List<AppUser> findByNameSetContainingIgnoreCase(String nameSet);

    // Find users by gender and city
    List<AppUser> findByGenderAndCity(String gender, String city);

    // Find users by state or country
    List<AppUser> findByStateOrCountry(String state, String country);

    // Find users whose age is less than
    List<AppUser> findByAgeLessThan(Integer age);

    // Find users whose age is greater than
    List<AppUser> findByAgeGreaterThan(Integer age);

    // Find users whose name contains a certain string
    List<AppUser> findByGivenNameContaining(String name);

    // Find users whose name starts with a certain string
    List<AppUser> findByGivenNameStartingWith(String prefix);

    // Find users by occupation ordered by name
    List<AppUser> findByOccupationOrderByGivenNameAsc(String occupation);

    // Find the first 3 users by a certain occupation
    List<AppUser> findFirst3ByOccupation(String occupation);

}