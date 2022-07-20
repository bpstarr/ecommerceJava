package com.sha.springbootproductseller.security.jwt;

import com.sha.springbootproductseller.security.UserPrinciple;
import javax.servlet.http.HttpServletRequest;
import org.springframework.security.core.Authentication;
public class JwtProvider {
    String generateToken(UserPrinciple auth);

    Authentication getAuthentication(HttpServletRequest request);

    boolean isTokenValid(HttpServletRequest request);
}
