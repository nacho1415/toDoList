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

    public void save(Task task) {
        em.persist(task);
    }
}
