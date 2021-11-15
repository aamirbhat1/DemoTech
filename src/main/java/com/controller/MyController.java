package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

import com.models.Channel;
import com.repository.MyRepository;

@RestController
@RequestMapping("home")
public class MyController{
	@Autowired
	MyRepository myRepo;
	
	@GetMapping("/get")
	public String readAll(WebRequest request, ModelAndView andView) {
	List<Channel> data=	myRepo.findAll();
		return data.toString();
	}
	
	@GetMapping("")
	public String addRecord(WebRequest request, @ModelAttribute("Channel") Channel channel, 
				Errors error, ModelAndView modelAndView) {
		
		return "";
	}
}
