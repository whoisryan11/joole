package com.lian.joole.Security;

import com.lian.joole.Entity.User;
import com.lian.joole.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.text.MessageFormat;
import java.util.Optional;

@Service
public class MyUserDetailService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User loadUserByUsername(String s) throws UsernameNotFoundException {
        final Optional<User> optionalUser = userRepository.findUserByEmail(s);

        return optionalUser.orElseThrow(() -> new UsernameNotFoundException(
                MessageFormat.format("User with username {0} cannot be found.", s)));
    }


}
