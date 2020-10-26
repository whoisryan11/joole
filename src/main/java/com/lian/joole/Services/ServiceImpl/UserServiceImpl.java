package com.lian.joole.Services.ServiceImpl;

import com.lian.joole.Entity.User;
import com.lian.joole.Repository.UserRepository;
import com.lian.joole.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(String username, String password, String email) throws Exception {
        if (username == null) { throw new Exception("Empty username"); }
        else if (password == null) { throw new Exception("Empty password");}
        else if (email == null) { throw new Exception("Empty email");}
        User newUser = new User();
        newUser.setUsername(username);
        newUser.setPassword(passwordEncoder.encode(password));
        newUser.setEmail(email);
        userRepository.saveAndFlush(newUser);
        return newUser;
    }
}
