package com.advanced.bank.bank.system.controller;

import com.advanced.bank.bank.system.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserControler {

    @GetMapping("/test")
    @RequestMapping("api/users")

    @PostMapping
    public void createUser(@RequestBody User user) {
    }

    @GetMapping
    public List<User> getUsers() {
        return null;
    }

    @GetMapping("/{UserId}")
    public List<User> getUser(@PathVariable("userId") Long userId) {
        return null;
    }

    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable("userId") Long userId) {

    }
}
