package com.example.todolist.Repository;

import com.example.todolist.Domain.Task;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class TaskRepository {

    @PersistenceContext
    EntityManager em;

    public List<Task> findAll () {
        return em.createQuery("SELECT t FROM Task t", Task.class).getResultList();
    }

    public Task findOne(Long id) {
        return em.find(Task.class, id);
    }

    public Task saveTask(String todo) {
        Task task = new Task();
        task.setTodo(todo);
        em.persist(task);
        return task;
    }

    public void deleteTask(Long id) {

        Task task = findOne(id);
        System.out.println(task + "찾았음3333333333333333333");
        em.remove(task);

    }
}
