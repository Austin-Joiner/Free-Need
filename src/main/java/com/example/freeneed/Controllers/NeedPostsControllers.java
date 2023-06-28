package com.example.freeneed.Controllers;

import com.example.freeneed.Models.NeedPosts;
import com.example.freeneed.Models.User;
import com.example.freeneed.Repositories.NeedPostsRepository;
import com.example.freeneed.Repositories.UserRepository;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

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
//    @GetMapping("/Need/Create")
//    public String createNeed(Model model) {
//
//
//        long userId = userDao.getId();
//        User user = userDao.findById(userId);
//        user = userDao.findById(userId);
//        model.addAttribute("user", user);
//
//        List<NeedPosts> posts = needPostsDao.findAll();
//
//        model.addAttribute("post", posts);
//
//
//
//
//        return "index/createNeed";
//    }
//    @PostMapping("/Needs")
//    public String setNeed(@ModelAttribute NeedPosts newPost) {
//        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
//        user = userDao.getReferenceById((long) user.getId());
////        long userId = user.getId();
////        user = userDao.findById(userId);
//
//        NeedPosts post = new NeedPosts();
//
//        post.setTitle(newPost.getTitle());
//        post.setBody(newPost.getBody());
//        post.setUser(user);
//        needPostsDao.save(post);
//
//        return "redirect:/Need";
//    }
}
