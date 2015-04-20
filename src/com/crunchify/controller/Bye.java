package com.crunchify.controller;
 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
/*
 * author: Crunchify.com
 * 
 */
 
@Controller
public class Bye {
 
    @RequestMapping("/bye")
    public ModelAndView bye() {
 
        String message = "<br><div style='text-align:center;'>"
                + "<h3>********** Bye!!! Spring MVC Tutorial</h3>This message is coming from Bye.java **********</div><br><br>";
        return new ModelAndView("bye", "message", message);
    }
}