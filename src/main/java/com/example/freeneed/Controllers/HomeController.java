package com.example.freeneed.Controllers;

import com.example.freeneed.Repositories.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    private final UserRepository userDao;

    public HomeController(UserRepository userDao) {
        this.userDao = userDao;
    }

    @GetMapping("/")
    public String goHome() {
        return "index/home";
    }


}
