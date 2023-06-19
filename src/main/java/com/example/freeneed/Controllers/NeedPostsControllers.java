package com.example.freeneed.Controllers;

import com.example.freeneed.Models.NeedPosts;
import com.example.freeneed.Models.User;
import com.example.freeneed.Repositories.NeedPostsRepository;
import com.example.freeneed.Repositories.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class NeedPostsControllers {

   private final UserRepository userDao;
   private final NeedPostsRepository needPostsDao;

    public NeedPostsControllers(UserRepository userDao, NeedPostsRepository needPostsDao) {
        this.userDao = userDao;
        this.needPostsDao = needPostsDao;
    }


    @GetMapping("/Need")
    public String toNeed(Model model) {

        User user = new User();
        long userId = user.getId();
        user = userDao.findById(userId);
        model.addAttribute("user", user);

        List<NeedPosts> posts = needPostsDao.findAll();

        model.addAttribute("post", posts);




        return "index/NeedPosts";
    }
}
