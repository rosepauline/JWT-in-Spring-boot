package com.dailycodebuffer.jwt.repository;

import com.dailycodebuffer.jwt.model.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.security.core.userdetails.*;
import org.springframework.stereotype.*;

@Repository
public interface UserRepository extends JpaRepository<JwtRequest, Long> {

    JwtRequest findByUsername(String userName);
}
