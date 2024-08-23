package com.todoapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.todoapp.Entity.TodoEntity;

import jakarta.persistence.Id;

@Repository
public interface TodoRepository  extends JpaRepository<TodoEntity, Integer >{
	
	
	

}
