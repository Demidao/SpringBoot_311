package com.demidao.services;

import com.demidao.models.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {

    List<User> index();

    User show(long id);

    User findByEmail(String email);

    void save(User user);

    void update(User newUser);

    void delete(long id);

    String passEncoder(String password);

    boolean checkPasswords(User u1, User u2);

}
