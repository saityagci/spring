package com.cydeo.controller;

import com.cydeo.model.Gender;
import com.cydeo.model.Mentor;
import com.cydeo.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MentorController {
    @RequestMapping("/welcome/mentor")
    public String mentorHomePage(Model model){
        Mentor mentor1=new Mentor("Mike","Smith", Gender.MALE,45);
        Mentor mentor2=new Mentor("Tom","Hanks", Gender.MALE,65);
        Mentor mentor3=new Mentor("Ammy","Bryan", Gender.FEMALE,25);
        model.addAttribute("mentor1",mentor1);
        model.addAttribute("mentor2",mentor2);
        model.addAttribute("mentor3",mentor3);
        return "mentor/welcome";
    }

}
