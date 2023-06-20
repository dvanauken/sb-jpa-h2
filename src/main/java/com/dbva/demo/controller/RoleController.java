package com.dbva.demo.controller;

import com.dbva.demo.repository.RoleRepository;
import com.dbva.demo.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class RoleController {

    @Autowired
    RoleRepository roleRepository;

    @GetMapping("/roles")
    public ResponseEntity<List<Role>> getAllRoles(@RequestParam(required = false) String name) {
        try {
            List<Role> roles = new ArrayList<Role>();

            if (name == null)
                roleRepository.findAll().forEach(roles::add);
            else
                roleRepository.findByNameContainingIgnoreCase(name).forEach(roles::add);

            if (roles.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(roles, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // Other CRUD operations here, similar to your TutorialController...
}
