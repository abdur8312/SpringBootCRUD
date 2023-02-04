package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.dao.Stud2Repo;
import com.example.demo.model.Stud2;

@Controller
public class StudentController {
	
	@Autowired
	Stud2Repo rep;
	
	@GetMapping("")
	public String home() {
		System.out.println("//");
		return "home2.jsp";
	}
	
	@GetMapping(value = "/addStudent")
	public String addStudent(Stud2 stud2) {
		//System.out.println(stud2.getStudid());
		System.out.println(stud2.getStudname());
		rep.save(stud2);
		System.out.println("saved");
		return "home2.jsp";
	}
}
