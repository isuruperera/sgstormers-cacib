package com.cacib.sgstormers.SpringInSingapore;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api")
public class RESTController {

    @GetMapping("/hello")
    public String helloApp() {
        return "Hello Stormers";
    }

}
