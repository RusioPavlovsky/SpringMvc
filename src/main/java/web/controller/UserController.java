package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.User;
import web.service.UserService;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping("/")
    public String index(ModelMap model) {
        return "user";
    }

    @PostMapping("/add")
    public String addUser(@RequestParam("user") User user, ModelMap model) {
        User userAdd =userService.addUser(user);
        model.addAttribute("user",userAdd);
        return "user";

    }

    @PostMapping("/id")
    public String updateUser(@RequestParam("id") Long id, User user, ModelMap model) {
        userService.updateUser(id, user);
        return "user";

    }

    @GetMapping("/read/id")
    public String readUser(@RequestParam("id") Long id, ModelMap model) {
        User userId = userService.findByIdUser(id);
        model.addAttribute("user", userId);
        return "user";

    }

    @GetMapping("/read")
    public String readAllUser(ModelMap model) {
        List<User> users =userService.findAllUser();
        model.addAttribute("users", users);
        return "user";

    }

    @PostMapping("/delete/id")
    public String deleteUser(@RequestParam("id") Long id, ModelMap model) {
        userService.deleteUser(id);
        return "user";

    }
}
