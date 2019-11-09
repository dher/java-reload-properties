package com.example.propwatcher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class PingService {

    @Autowired
    private Environment env;

    public String getString(){

        return env.getProperty("message");

    }

}
