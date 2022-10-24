package com.mytests.thymeleaf.thymeleafvars;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class MyController {

    @RequestMapping("/")
    public String home(ModelMap model) {
       populateModel(model);
        return "users";
    }
    private void populateModel(ModelMap model){
        model.addAttribute("usersList", listUsers());
        model.addAttribute("usersMap", userMap());
        model.addAttribute("stringMap", stringMap());
        model.addAttribute("nestedLists", nestedLists());
    }
    private List<User> listUsers(){
        List<User> list=new ArrayList<>();
        list.add(new User("masha",25));
        list.add(new User("sasha",20));
        list.add(new User("dasha",18));
        return list;
    }

    private Map<String,String> stringMap(){
        Map<String, String> map = new HashMap<>();
        map.put("key1","val1");
        map.put("key2","val2");
        return map;
    }

    private Map<String,User> userMap(){
        Map<String, User> map = new HashMap<>();
        map.put("u1",new User("pasha",28));
        map.put("u2",new User("natasha",15));
        return map;
    }
    private List<Team> nestedLists(){
        List<Team> teams = new ArrayList<>();
        List<User> u1=new ArrayList<>();
        u1.add(new User("masha",25));
        u1.add(new User("natasha",20));
        u1.add(new User("dasha",18));
        List<User> u2=new ArrayList<>();
        u2.add(new User("vanya",25));
        u2.add(new User("sanya",20));
        u2.add(new User("danya",18));
        teams.add(new Team("girls",u1));
        teams.add(new Team("boys",u2));
        return teams;
    }
}
