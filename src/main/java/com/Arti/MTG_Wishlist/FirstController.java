package com.Arti.MTG_Wishlist;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstController {
    @RequestMapping
    public String index(){
        return "index.html";
    }
}
