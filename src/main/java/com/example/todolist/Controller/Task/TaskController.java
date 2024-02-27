package com.example.todolist.Controller.Task;

import com.example.todolist.Domain.Task;
import com.example.todolist.Service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

@Controller
@RequestMapping("/task")
public class TaskController {

    @Autowired
    TaskService taskService;

    @PostMapping("/createTask")
    public String saveTask (@RequestParam("todo") String todo) {
        System.out.println("확인1111111111111111111111111111111111111111111111111111111111111111");
//        System.out.println();
        taskService.saveTask(todo);
        return "redirect:/";
    }

    @PostMapping("/deleteTask")
    public String deleteTask(@RequestParam("taskId") Long id) {
        System.out.println(id.getClass());
        taskService.deleteTask(id);
        System.out.println("실행되나2222222222222222");
        return "redirect:/";
    }
}
