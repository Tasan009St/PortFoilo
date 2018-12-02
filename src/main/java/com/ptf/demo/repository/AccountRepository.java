package com.ptf.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ptf.demo.entity.Account;
public interface AccountRepository extends JpaRepository<Account, String> {
    public Account findByUsername(String username); 
}