package com.kodnest.rolebasedsecurity.Service;

import com.kodnest.rolebasedsecurity.Entity.Users;
import com.kodnest.rolebasedsecurity.Reposotiory.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    Repo repo;
    public Users findByname(String name){
        return repo.findByUsername(name);
    }
}
