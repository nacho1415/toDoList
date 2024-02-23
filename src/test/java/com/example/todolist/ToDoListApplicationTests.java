package com.example.todolist;

import com.example.todolist.Domain.Task;
import com.example.todolist.Repository.TaskRepository;
import com.example.todolist.Service.TaskService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
class ToDoListApplicationTests {

	@Autowired
	TaskRepository taskRepository;

	@Autowired
	TaskService taskService;

	@Test
//	@Transactional
	public void 모든임무찾기() {
		taskService.getAllTask();

	}

}
