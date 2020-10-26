package com.lian.joole.Services;

import com.lian.joole.Entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User createUser(String username, String password, String email) throws Exception;
}
