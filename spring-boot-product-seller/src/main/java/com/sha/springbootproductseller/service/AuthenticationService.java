package com.sha.springbootproductseller.service;

import com.sha.springbootproductseller.model.User;

public class AuthenticationService {
    User signInAndReturnJWT(User signInRequest);
}
