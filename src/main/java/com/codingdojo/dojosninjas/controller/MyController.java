package com.codingdojo.dojosninjas.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.dojosninjas.models.Dojos;
import com.codingdojo.dojosninjas.models.Ninjas;
import com.codingdojo.dojosninjas.service.DojosNinjasService;

@Controller
public class MyController {
@Autowired
private DojosNinjasService dojosninjasService;

//TESTING ROUTES FOR JSP FILES

	@RequestMapping("/new/dojo")
	public String newdojohome() {
		return "NewDojo.jsp";
	}
	@RequestMapping("/new/ninja")
	public String newninjahome(Model model) {
		List<Dojos> dojos = dojosninjasService.Dall();
		model.addAllAttributes(dojos);	
		return "NewNinja.jsp";
	}
	@RequestMapping("/showboth")
	public String showboth() {
		return "ShowBoth.jsp";
	}
	
	
//CREATE METHODS
	
	@PostMapping("/create/dojo")
	public String createD(@Valid @ModelAttribute("dojos") Dojos dojos, BindingResult result) {
        if (result.hasErrors()) {
            return "new.jsp";
        } else {
		dojosninjasService.createD(dojos);
		return "redirect:/new/dojo";
        }
	}
	
	@PostMapping("/create/ninja")
	public String createN(@Valid @ModelAttribute("ninjas") Ninjas ninjas, BindingResult result) {
        if (result.hasErrors()) {
            return "new.jsp";
        } else {
		dojosninjasService.createN(ninjas);
		return "redirect:/new/dojo";
        }
	}
	
}
