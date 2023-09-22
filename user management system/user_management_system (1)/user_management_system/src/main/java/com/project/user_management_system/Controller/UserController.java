package com.project.user_management_system.Controller;

import com.project.user_management_system.Entity.User;
import com.project.user_management_system.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class UserController {
    @Autowired
    UserService userService;

    //post or adduser or users
    @PostMapping("user")    //addUser
    public String addUser(@RequestBody User u)
    {
        return userService.inputUser(u);
    }



    @GetMapping("users")  //getAllUser
    public List<User> getAllUsers()
    {
        return userService.getAllUser();
    }

    @GetMapping("user/{iD}") //getUser/{userid}
    public User getUserById(@PathVariable Integer iD)
    {
        return userService.getUser(iD);
    }


    @PutMapping("user/{iD}/number/{num}")
    public String updateUserNumById(@PathVariable Integer iD,  @PathVariable String num)
    {
        return userService.updateUserNumber(iD,num);
    }



    //deleteUser
    @DeleteMapping("user/{iD}")
    public String deleteUserById(@PathVariable Integer iD)
    {
        return userService.deleteUser(iD);
    }

}