package com.kodnest.rolebasedsecurity.Controller;

import com.kodnest.rolebasedsecurity.Entity.Users;
import com.kodnest.rolebasedsecurity.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService userService;
@PostMapping("/login")
    public String Auth(@RequestParam String username,@RequestParam String password){
        Users byName = userService.findByname(username);

        if(byName!=null && password.equals(byName.getPassword())){

            if(byName.getRole().equals("ADMIN")){
                return "Hello Admin access the Resources";
            }
            else{
                return "Hello User Access your resources";
            }

        }
        return "Invalid UserID Password";

    }

}
