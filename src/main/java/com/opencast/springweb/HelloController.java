package com.opencast.springweb;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.net.InetAddress;
import java.net.UnknownHostException;

@Controller
public class HelloController {

    @GetMapping("/")
    public String sayHello(Model model) throws UnknownHostException {
        model.addAttribute("message",
                "Hello " + "Served by: " + InetAddress.getLocalHost().getHostName());
        return "hello";
    }
}
