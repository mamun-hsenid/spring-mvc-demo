package com.finaltry.finaltrymvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContactController {
    @GetMapping("/contact")
    public String home(){
        return "contact";
    }
}
