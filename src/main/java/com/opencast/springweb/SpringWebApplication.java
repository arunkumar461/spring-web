package com.opencast.springweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@SpringBootApplication
@RestController
public class SpringWebApplication {

    @GetMapping("/whoami")
    public String whoami() throws UnknownHostException {
        return "Served by: " + InetAddress.getLocalHost().getHostName();
    }


    public static void main(String[] args) {
        SpringApplication.run(SpringWebApplication.class, args);
    }

}
