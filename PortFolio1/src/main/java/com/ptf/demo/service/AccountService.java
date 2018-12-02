package com.ptf.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.ptf.demo.entity.Account;
import com.ptf.demo.repository.AccountRepository;
@Service
public class AccountService implements UserDetailsService {
  @Autowired
  private AccountRepository accRepo;
  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    if (username == null || username.isEmpty()) {
      throw new UsernameNotFoundException("");
    }
    Account userInfo = accRepo.findByUsername(username);
    if (userInfo == null) {
      throw new UsernameNotFoundException("");
    }
    return userInfo;
  }
}