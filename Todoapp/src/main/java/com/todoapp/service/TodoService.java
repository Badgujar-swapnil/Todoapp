package com.todoapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todoapp.Entity.TodoEntity;
import com.todoapp.repository.TodoRepository;

@Service
public class TodoService {
	@Autowired
	private TodoRepository repo;
	
	public void addtask(TodoEntity E )
	{
		repo.save(E);
	}
	 public Iterable<TodoEntity> getAllTasks() {
	        // Retrieve all tasks from the repository
	        return repo.findAll();
	    }
	 public void deleteTask(int id) {
	        repo.deleteById(id);
	    }
	

}
