package com.project.user_management_system.Repo;

import com.project.user_management_system.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepo {
    @Autowired
    private List<User> userList;

    public List<User> getUsers(){

        return userList;

    }



}