package controllers;

import java.util.ArrayList;
import java.util.List;

import models.Employee;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstController{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8677681L;

/*	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {

		model.addAttribute("message", "Spring 3 MVC Hello World");
		return "javaservletpage";

	}
	
	@RequestMapping(value = "/hello/{name}", method = RequestMethod.GET)
	public ModelAndView hello(@PathVariable("name") String name) {

		ModelAndView model = new ModelAndView();
		model.setViewName("javaservletpage");
		model.addObject("message", name);

		return model;

	}
	*/
	@RequestMapping(value = "/employee", method = RequestMethod.GET, produces={"application/xml", "application/json"})
	public @ResponseBody List<Employee> employee(@PathVariable("emp") Employee emp){
		
		List<Employee> emps = new ArrayList<Employee>();
		emps.add(new Employee("Shagun", 3760));
		emps.add(new Employee("Kunal", 1234));
		emps.add(new Employee("Rekha", 9876));
		
		return emps;
	}

}
