package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import web.dao.UserDao;
import web.model.User;
import web.service.UserService;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String printWelcome(Model model) {
        List<User>  allUser = userService.getAllUser();
        model.addAttribute("AllUser", allUser);
        return "user";
    }
    @GetMapping("/new")
    public String addNewUser(@ModelAttribute("newuser") User user) {
        return "user-info";
    }

    @PostMapping("/save")
    public String saveUser(@ModelAttribute("newuser") User user) {
        userService.saveUser(user);
        return "redirect:/";
    }
    @GetMapping("/updateInfo")
    public String updateUser(@RequestParam(value= "id") Long id, Model model) {
        User user = userService.getUser(id);
        model.addAttribute("newuser",user);
    return "user-info";
    }
    @GetMapping("/deleteInfo")
    public String deleteUser(@RequestParam(value= "id") Long id) {
        userService.deleteUser(id);
        return "redirect:/";
    }
}
