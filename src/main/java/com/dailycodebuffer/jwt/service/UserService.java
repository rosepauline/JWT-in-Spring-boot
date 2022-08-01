package com.dailycodebuffer.jwt.service;

import com.dailycodebuffer.jwt.model.*;
import com.dailycodebuffer.jwt.repository.*;
import lombok.extern.slf4j.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Slf4j
@Service
public class UserService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        log.info("loadUserByUsername", userName);
        //Logic to get the user form the Database
        try{
            log.info("try");
            JwtRequest user = userRepository.findByUsername(userName);
            log.info("user", user);
            if(user != null){
                return new User(user.getUsername(),user.getPassword(),new ArrayList<>());
            }
//
        }catch (Exception e){
            log.info("e",e);
        }
//           if(userName.equals("admin")){
//                return new User("admin","password",new ArrayList<>());
//
//            }
        return null;
    }
}
