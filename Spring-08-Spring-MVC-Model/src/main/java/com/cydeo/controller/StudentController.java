package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
public class StudentController {
    @RequestMapping("/welcome")
    public String homePage(Model model){
        model.addAttribute("name","Cydeo");
        model.addAttribute("course","Mvc");
        String subject="Collection";
        model.addAttribute("subject",subject);
        //create some random studentId(0-1000) and show it in your UI
        int studentId=new Random().nextInt();
        model.addAttribute("ID",studentId);

        List<Integer>numbers=new ArrayList<>();
        numbers.add(4);
        numbers.add(42);
        numbers.add(14);
        numbers.add(43);
        numbers.add(41);
        numbers.add(45);
        numbers.add(49);
        model.addAttribute("numbers",numbers);
        return "student/welcome";
    }

}
