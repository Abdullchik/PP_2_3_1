package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.models.User;
import web.service.UserService;

@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/main")
    public String viewUsers(Model model) {
        model.addAttribute("usersList", userService.getUsersList());
        return "main";
    }

    @GetMapping("/main/{id}")
    public String viewUser(Model model, @PathVariable Long id) {
        model.addAttribute("user", userService.get(id));
        return "user";
    }

    @PostMapping("/addUser")
    public String addUser(@ModelAttribute("user") User user) {
        userService.add(user);
        return "redirect:/main";
    }
}
