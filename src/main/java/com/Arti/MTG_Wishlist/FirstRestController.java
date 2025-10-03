package com.Arti.MTG_Wishlist;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstRestController {

    @GetMapping("/rest_index")
    public String restIndex(){
        return "Hello World (but in rest)";
    }
}
