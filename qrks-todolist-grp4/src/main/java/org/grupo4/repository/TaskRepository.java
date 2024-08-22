package org.grupo4.repository;

import jakarta.enterprise.context.ApplicationScoped;
import org.grupo4.model.Task;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

//import java.util.List;
//import java.util.Arrays;

@ApplicationScoped
public class TaskRepository implements PanacheRepository<Task>{
    /*public List<Task> listAllTasks() {
        // Ejemplo de datos simulados
        Task task1 = new Task();
        task1.setId(1L);
        task1.setName("Tarea 1");
        task1.setCompleted(false);

        Task task2 = new Task();
        task2.setId(2L);
        task2.setName("Tarea 2");
        task2.setCompleted(true);

        Task task3 = new Task();
        task3.setId(3L);
        task3.setName("Tarea 3");
        task3.setCompleted(false);

        return Arrays.asList(task1, task2, task3);
    }*/
}
