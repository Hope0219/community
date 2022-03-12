package com.community.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller   //把这个类当作spring的bean来管理，同时接收前端的请求
public class HelloController {

    @GetMapping  //=@RequestMapping(method = RequestMethod.GET)
                    //@PostMapping=@RequestMapping(method = RequestMethod.POST)
    public String hello(@RequestParam(name= "name")String name, Model model){
       model.addAttribute("name",name);
       return "index";
    }
}
