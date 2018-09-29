package com.orlando.ws;

import javax.jws.WebService;

@WebService
public interface HelloWorld {
    String sayHi(String text);
    
    public int sum(int a, int b);
}

