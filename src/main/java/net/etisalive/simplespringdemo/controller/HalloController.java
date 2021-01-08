package net.etisalive.simplespringdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class HalloController {

    @GetMapping("/api/name")
    public String name(String name) {
        if (name == null || "".equals(name)) {
            return "Hey noname";
        }
        return "Hallo " + name;
    }
}
