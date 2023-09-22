package com.project.user_management_system.BeanBag;

import com.project.user_management_system.Entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeanMaker {

    @Bean
    public List<User> getUsers(){

        return new ArrayList<>();
    }
}