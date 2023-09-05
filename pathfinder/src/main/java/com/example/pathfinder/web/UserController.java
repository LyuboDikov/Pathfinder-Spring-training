package com.example.pathfinder.web;

import com.example.pathfinder.models.binding.UserRegisterBindingModel;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/users")
public class UserController {

    @ModelAttribute
    public UserRegisterBindingModel userRegisterBindingModel() {
        return new UserRegisterBindingModel();
    }

    @GetMapping("/register")
    public String register(Model model) {

        return "register";
    }

    @PostMapping("/register")
    public String registerConfirm(@Valid UserRegisterBindingModel userRegisterBindingModel,
                                  BindingResult bindingResult, RedirectAttributes redirectAttributes) {

        if (bindingResult.hasErrors()) {
        redirectAttributes
                .addFlashAttribute("userRegisterBindingModel", userRegisterBindingModel)
                .addFlashAttribute("org.springframework.validation.BindingResult.userRegisterBindingModel",
                        bindingResult);

        return "redirect:register";
        }

        return "redirect:/";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }
}
