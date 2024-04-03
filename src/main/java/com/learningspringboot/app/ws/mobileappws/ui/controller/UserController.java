package com.learningspringboot.app.ws.mobileappws.ui.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {


    @GetMapping
    public String getUsers(@RequestParam(value = "page", defaultValue = "1") int page,
                           @RequestParam(value="limit", defaultValue= "50") int limit,
                            @RequestParam(value="sort", defaultValue="desc", required= false) String sort)
    {
        return "get user was called with page= "+ page + " and limit= "+ limit + "and sort = "+ sort ;
    }
    @GetMapping(path="/{userId}")
    public String getUser(@PathVariable String userId){
        return "get user was called with userId= "+ userId;
    }

    @PostMapping
    public String createUser(){
        return "create user was called";
    }

    @PutMapping
    public String updateUser(){
        return "update user was called";
    }

    @DeleteMapping
    public String deleteUser(){
        return "delete user was called";
    }
}
