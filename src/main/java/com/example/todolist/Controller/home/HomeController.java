package com.example.todolist.Controller.home;

import com.example.todolist.Domain.Task;
import com.example.todolist.Service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller
@RequestMapping()
public class HomeController {

    @Autowired
    TaskService taskService;

    @GetMapping()
    public String getAllTask(Model model) {
        List<Task> tasks = taskService.getAllTask();
        model.addAttribute("tasks", tasks);
        return "index.html";
    }

}
