package de.heilmann.springboot.angular.template.adapter.rest;

import de.heilmann.springboot.angular.template.application.UserService;
import de.heilmann.springboot.angular.template.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping(value = "/users", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @PostMapping("/users")
    public User addUser(@RequestBody User user) {
        return userService.save(user);
    }

}
