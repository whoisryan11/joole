package com.lian.joole.Controller;

import com.lian.joole.Entity.User;
import com.lian.joole.Requests.AuthenticationRequest;
import com.lian.joole.Requests.RegisterRequest;
import com.lian.joole.Security.AuthenticationResponse;
import com.lian.joole.Security.MyUserDetailService;
import com.lian.joole.Services.UserService;
import com.lian.joole.Util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
public class UserController {
    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserService userService;

    @Autowired
    private MyUserDetailService myUserDetailService;

    @Autowired
    private JwtUtil JwtUtil;

    @RequestMapping("/")
    public ResponseEntity<?> sayHello(@RequestParam(value = "myName", defaultValue = "World") String name){
        return ResponseEntity.ok(String.format("Hello %s", name));
    }

    @RequestMapping(value = "/authenticate/login", method = RequestMethod.POST)
    public ResponseEntity<?> CreateAuthenticationToken(@RequestBody AuthenticationRequest request) throws Exception {
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                    request.getUsername(), request.getPassword()
            ));
        } catch (BadCredentialsException e) {
            return new ResponseEntity(HttpStatus.UNAUTHORIZED);
            //throw new Exception("Incorrect Username or password", e);


        }
        final User userDetails = myUserDetailService.loadUserByUsername(request.getUsername());
        final String token = JwtUtil.generateToken(userDetails);
        final Date expirationDate = JwtUtil.extractExpiration(token);
        final Integer userId = userDetails.getId();
        return ResponseEntity.ok(new AuthenticationResponse(token,  expirationDate, userId));
    }

    @PostMapping("/authenticate/register")
    public ResponseEntity<?> registerUser(@RequestBody RegisterRequest request) throws  Exception {
        User newUser = userService.createUser(
                request.getUsername(),
                request.getPassword(),
                request.getEmail()
        );
        return ResponseEntity.ok(newUser);
    }
}
