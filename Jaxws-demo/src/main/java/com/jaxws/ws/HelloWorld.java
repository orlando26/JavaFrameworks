package com.jaxws.ws;

import javax.jws.WebService;

import com.jaxws.bo.User;

@WebService
public interface HelloWorld {
    String sayHi(String text);
    
    int sum(int a, int b);
    
    User getUserByEmail(String email);
}

