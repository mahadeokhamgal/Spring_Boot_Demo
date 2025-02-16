package com.author.demo;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private Map<Long, String> users = new HashMap<>(); // Simulating a database

    // Create a new user
    @PostMapping
    public String createUser(@RequestParam String name) {
        Long id = (long) (users.size() + 1);
        users.put(id, name);
        return "User " + name + " created with ID " + id;
    }

    // Read a user
    @GetMapping("/{id}")
    public String getUser(@PathVariable Long id) {
        return users.getOrDefault(id, "User not found");
    }

    // Update a user
    @PutMapping("/{id}")
    public String updateUser(@PathVariable Long id, @RequestParam String name) {
        if (users.containsKey(id)) {
            users.put(id, name);
            return "User updated to " + name;
        }
        return "User not found";
    }

    // Delete a user
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id) {
        return users.remove(id) != null ? "User deleted" : "User not found";
    }
}
