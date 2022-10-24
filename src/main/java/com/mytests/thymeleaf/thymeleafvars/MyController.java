package com.mytests.thymeleaf.thymeleafvars;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MyController {

    @RequestMapping("/")
    public String home(ModelMap model) {
        model.addAttribute("usersList", listUsers());
        return "users";
    }

    private List<User> listUsers(){
        List<User> list=new ArrayList<>();
        list.add(new User("masha",25));
        list.add(new User("sasha",20));
        list.add(new User("dasha",18));
        return list;
    }
}
