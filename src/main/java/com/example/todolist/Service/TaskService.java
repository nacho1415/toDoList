package com.example.todolist.Service;

import com.example.todolist.Domain.Task;
import com.example.todolist.Repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class TaskService {

    @Autowired
    TaskRepository taskRepository;

    @Transactional
    public List<Task> getAllTask() {
        return taskRepository.findAll();
    }

    @Transactional
    public Task saveTask(String todo) {
        return taskRepository.saveTask(todo);
    }

    @Transactional
    public void deleteTask(Long id) {
        taskRepository.deleteTask(id);
    }
}
