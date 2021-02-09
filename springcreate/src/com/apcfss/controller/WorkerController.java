package com.apcfss.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.apcfss.model.Worker;
@Controller
@RequestMapping("/worker")
public class WorkerController 
{

	@RequestMapping(value="/create",method = RequestMethod.GET)
	ModelAndView create(HttpServletRequest request, HttpServletResponse response)
	{
		ModelAndView modelAndView=new ModelAndView();
		 modelAndView.addObject("worker",new Worker());
	
		modelAndView.setViewName("worker");
		 return modelAndView;
	}
	
	@RequestMapping(value="/save",method = RequestMethod.POST)
	ModelAndView save(HttpServletRequest request, HttpServletResponse response,@ModelAttribute("worker")Worker worker)
	{
		
		System.out.println("Name"+ worker.getName());
		System.out.println("TypeOfWorker"+ worker.getTypeOfWorker());
		System.out.println("Age"+ worker.getAge());
		
		return null;
		
		
		
	}
	
}
