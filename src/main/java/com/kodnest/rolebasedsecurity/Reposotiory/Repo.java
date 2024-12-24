package com.kodnest.rolebasedsecurity.Reposotiory;

import com.kodnest.rolebasedsecurity.Entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repo extends JpaRepository<Users,Integer> {
    Users findByUsername(String name);
}
