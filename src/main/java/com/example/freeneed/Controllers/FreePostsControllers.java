package com.example.freeneed.Controllers;

import com.example.freeneed.Models.FreePosts;
import com.example.freeneed.Models.User;
import com.example.freeneed.Repositories.FreePostsRepository;
import com.example.freeneed.Repositories.UserRepository;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class FreePostsControllers {

    private final UserRepository userDao;
    private final FreePostsRepository freePostsDao;

    public FreePostsControllers(UserRepository userDao, FreePostsRepository freePostsDao) {
        this.userDao = userDao;
        this.freePostsDao = freePostsDao;
    }


    @GetMapping("/Free")
    public String toFree(Model model) {

                User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        user = userDao.getReferenceById((long) user.getId());
        model.addAttribute("user", user);

        List<FreePosts> posts = freePostsDao.findAll();

        model.addAttribute("post", posts);

        return "index/FreePosts";
    }
}
