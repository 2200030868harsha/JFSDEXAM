package com.klef.jfsdexam;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ClientController {
    
    @RequestMapping("/welcome")
    public String welcome(Model model) {
        model.addAttribute("message", "Welcome to Spring MVC!");
        return "test";
    }

    @RequestMapping("/test")
    public String testPage() {
        return "test";
    }

    @RequestMapping("/showInfo")
    public String showInfo(@RequestParam("id") int id, @RequestParam("name") String name, Model model) {
        model.addAttribute("id", id);
        model.addAttribute("name", name);
        return "showInfo";
    }

    @RequestMapping("/calculateSum/{num1}/{num2}")
    public String calculateSum(@PathVariable int num1, @PathVariable int num2, Model model) {
        int sum = num1 + num2;
        model.addAttribute("sum", sum);
        return "result";
    }

    @RequestMapping("/employeeForm")
    public String employeeForm() {
        return "employeeForm";
    }

    @RequestMapping("/addNumbers")
    public String addNumbers(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model) {
        int result = num1 + num2;
        model.addAttribute("result", result);
        return "addNumbers";
    }

    @RequestMapping("/combine")
    public String combine(@RequestParam("str1") String str1, @RequestParam("str2") String str2, Model model) {
        String combined = str1 + " " + str2;
        model.addAttribute("combined", combined);
        return "combine";
    }

    @RequestMapping("/calculate")
    public String calculate(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model) {
        int sum = num1 + num2;
        int product = num1 * num2;
        model.addAttribute("sum", sum);
        model.addAttribute("product", product);
        return "calculate";
    }
}
