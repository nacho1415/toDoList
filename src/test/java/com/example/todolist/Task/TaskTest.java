//package com.example.todolist.Task;
//
//import com.example.todolist.Domain.Task;
//import com.example.todolist.Repository.TaskRepository;
//import com.example.todolist.Service.TaskService;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.List;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//@SpringBootTest
//public class TaskTest {
//
//    @Autowired
//    TaskService taskService;
//
//    @Autowired
//    TaskRepository taskRepository;
//
//    @Test
//    @Transactional
//    public void 임무저장 () {
//        Task task = new Task();
//        task.setTodo("달리기");
//        taskService.saveTask(task);
//        Task findTask = taskRepository.findOne(1L);
//        assertThat(findTask.getId()).isEqualTo(task.getId());
//    }
//
//    @Test
//    @Transactional
//    public void 전체임무조회 () {
//        Task task1 = new Task();
//        task1.setTodo("달리기");
//        taskService.saveTask(task1);
//
//        Task task2 = new Task();
//        task2.setTodo("달리기");
//        taskService.saveTask(task2);
//
//        List<Task> tasks = taskService.getAllTask();
//        assertThat(tasks.size()).isEqualTo(2);
//    }
//}
