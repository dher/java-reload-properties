package com.example.propwatcher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {

    @Autowired
    PingService pingService;

    @Autowired
    private Environment env;

    @GetMapping("/ping")
    public String ping(){
        return "ping";
    }

    @GetMapping("/ping-prop")
    public String pingProp(){

        String string = env.getProperty("message");
        System.out.println("### pingProp: access the properties via env on controller ");
        System.out.println("### pingProp: "+ string);

        return string;
    }

    @GetMapping("/ping-service")
    public String pingService(){
        String string = pingService.getString();
        System.out.println("### pingService: access the properties via env on service ");
        System.out.println("### pingService: "+ string);

        return string;
    }

}
