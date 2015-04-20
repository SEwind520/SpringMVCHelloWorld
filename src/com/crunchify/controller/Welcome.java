package com.crunchify.controller;
 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
 
/*
 * author: Crunchify.com
 * 
 */
 
@Controller
@RequestMapping("/welcome")
public class Welcome {
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView welcome() {
 
        String message = "<br><div style='text-align:center;'>"
                + "<h3>********** Hello World, Spring MVC Tutorial</h3>This message is coming from Welcome.java / welcome() **********</div><br><br>";
        return new ModelAndView("welcome", "message", message);
    }
    
    @RequestMapping(value = "/talk", method = RequestMethod.GET)
    public ModelAndView welcomeThenTalk() {
 
        String message = "<br><div style='text-align:center;'>"
                + "<h3>********** blablabla...</h3>This message is coming from Welcome.java / welcomeThenTalk() **********</div><br><br>";
        return new ModelAndView("welcome", "message", message);
    }
}