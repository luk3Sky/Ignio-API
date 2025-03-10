package com.foxploit.ignio.userinfoservice.resources;

import com.foxploit.ignio.userinfoservice.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpServerErrorException;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/signin")
    @ResponseStatus(HttpStatus.OK)
    public UserDto login(@RequestBody @Valid LoginDto loginDto) {
        return userService.signin(loginDto.getUsername(), loginDto.getPassword()).orElseThrow(() -> new HttpServerErrorException(HttpStatus.FORBIDDEN, "Login Failed"));
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/signup")
    @ResponseStatus(HttpStatus.CREATED)
    public User signup(@RequestBody @Valid LoginDto loginDto) {
        return userService.signup(loginDto.getUsername(), loginDto.getPassword(), loginDto.getEmail(), loginDto.getFirstName(), loginDto.getLastName()).orElseThrow(() -> new HttpServerErrorException(HttpStatus.BAD_REQUEST, "User already exists"));
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PatchMapping("/update")
    @PreAuthorize("hasRole('ROLE_CONSUMER')")
    @ResponseStatus(HttpStatus.OK)
    public User update(@RequestBody @Valid User user) {
        return userService.update(user.getUsername(), user).orElseThrow(() -> new HttpServerErrorException(HttpStatus.PRECONDITION_FAILED, "User details update failed"));
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/")
    @ResponseStatus(HttpStatus.FOUND)
    @PreAuthorize("hasRole('ROLE_ADMIN') or hasRole('ROLE_CONSUMER')")
    public User loadUser(@RequestBody @Validated String token){
        System.out.println(token);
//        userService.loadUser(user);
        return new User();
    }

//    @GetMapping
//    @PreAuthorize("hasRole('ROLE_ADMIN')")
//    public List<User> getAllUsers() {
//        return userService.getAll();
//    }

//    @GetMapping
//    @PreAuthorize("hasRole('ROLE_ADMIN')")
//    public Iterable<User> getAllUsers() {
//        return userService.getAll();
//    }

}
