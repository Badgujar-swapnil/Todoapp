package com.todoapp.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TodoEntity {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int id;
	private String task;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTask() {
		return task;
	}
	@Override
	public String toString() {
		return "TodoEntity [id=" + id + ", task=" + task + "]";
	}
	public TodoEntity(int id, String task) {
		super();
		this.id = id;
		this.task = task;
	}
	public TodoEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setTask(String task) {
		this.task = task;
	}
	
	
	
	

}
