package com.example.Rest.API.Rest.API.Controller;

import com.example.Rest.API.Rest.API.Entity.Student;
import org.springframework.web.bind.annotation.*;


@RestController
public class StudentController {

    //@RequestMapping(value = "/home", method = RequestMethod.GET)
    @GetMapping("/data")
    public Student getStudent(){
        Student s1 = new Student();
        s1.setId(1);
        s1.setName("JITENDRA");
        s1.setAddress("CTC");
        return s1;
    }


    @GetMapping("/login")
    public String login(){
        return "Login Page Invoked!";
    }

    @GetMapping("register")
    public String register(){
        return "You are Inside Register page...";
    }

    @PostMapping("/createStudent")
    public String createStudent(@RequestBody Student s){
        Student s1 = s;

        return "Student Created Successfully!";
    }
}
