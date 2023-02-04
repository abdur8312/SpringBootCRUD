package com.example.demo.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.Service.DragonService;
import com.example.demo.model.DragonDB;

@Controller
public class DragonController {
	
	@Autowired
	private DragonService service;
	
	@GetMapping("/home")
	public String dragHome() {
		System.out.println("Done");
		return "dragonHome.html";
	}
	
	@PostMapping("/addDragon")
	public String addDragon(DragonDB dragonDB) {
		System.out.println("Done 1");
		System.out.println(dragonDB.getDragname());
		service.save(dragonDB);
		System.out.println("saved");
		return "dragonHome.html";
	}
	
	@GetMapping("/showDragInfo")
	public String showDragInfo(Model model) {
		System.out.println("Done 2");
		List<DragonDB> list = service.listAll();
		System.out.println("list finished");
		model.addAttribute("list", list);
		System.out.println("model finished");
		for(DragonDB i : list) {
			System.out.println(i.getDragname());
			System.out.println(i.getDragonid());
		}
		System.out.println("for loop finished");
		return "showData";
	}
	
	@GetMapping("/updateDragon")
	public ModelAndView updateDragon(@RequestParam(name = "dragonid") Integer id) {
		System.out.println("Front end : " + id);
		System.out.println("DragonController.updateDragon()");
		ModelAndView mav = new ModelAndView("update");
		System.out.println("arrived mav");
		DragonDB dragonDB = service.get(id);
		System.out.println("got the id");
		mav.addObject("dragonDB", dragonDB);
		System.out.println(dragonDB.getDragonid());
		System.out.println(dragonDB.getDragname());
		System.out.println("object added");
		return mav;
	}
	
	@GetMapping("/deleteDragon")
	public String deleteDragon(@RequestParam(name = "dragonid") Integer id) {
		service.delete(id);
		return "redirect:/home";
	}
	
	
	
}
