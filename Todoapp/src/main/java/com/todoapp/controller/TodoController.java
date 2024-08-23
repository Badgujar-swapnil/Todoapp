package com.todoapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.todoapp.Entity.TodoEntity;
import com.todoapp.service.TodoService;

@Controller
public class TodoController {
	@Autowired
	private TodoService service;
	
	 @GetMapping("/")
	    public String home(Model model) {
	        // Get all tasks from the service
	        Iterable<TodoEntity> tasks = service.getAllTasks();
	        // Add tasks to the model
	        model.addAttribute("tasks", tasks);
	        // Return the view name
	        return "home";
	    }
	@PostMapping("/save")
	public String saveTask(@ModelAttribute TodoEntity E) {
	    // Logic to save the task
        System.out.println("Received data: " +E.toString());

	    service.addtask(E);
	    return "redirect:/"; // Redirect to the home page after saving the task
	}
	 @GetMapping("/delete/{id}")
	    public String deleteTask(@PathVariable("id") int id) {
	        service.deleteTask(id);
	        return "redirect:/";
	    }
	 
	
	    
	
	
	
	
	

}
