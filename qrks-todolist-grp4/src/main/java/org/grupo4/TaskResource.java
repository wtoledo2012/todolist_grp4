package org.grupo4;

import java.util.List;
import java.util.ArrayList;

import org.grupo4.repository.TaskRepository;
import org.grupo4.model.TaskList;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import org.grupo4.model.Task;

@Path("/tasks")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TaskResource {

    //private static List<Task> tasks = new ArrayList<>(); // Para pruebas sin persistencia

    @Inject
    TaskRepository taskRepository;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from Quarkus REST";
    }

    @GET
    @Path("/all")
    public Response getAllTasks() {
        List<Task> tasks = taskRepository.listAll();
        return Response.ok(new TaskList(tasks)).build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Response createTask(Task task) {
        taskRepository.persist(task);
        //task.setId((long) (tasks.size() + 1));
        return Response.status(Response.Status.CREATED).entity(task).build();
    }

    @PUT
    @Path("{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Response updateTask(@PathParam("id") Long id, Task task) {
        Task existingTask = taskRepository.findById(id);
        if (existingTask == null) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        existingTask.setName(task.getName());
        existingTask.setCompleted(task.getCompleted());
        taskRepository.persist(existingTask);
        return Response.ok(existingTask).build();
    }

    @DELETE
    @Path("{id}")
    @Transactional
    public Response deleteTask(@PathParam("id") Long id) {
        Task task = taskRepository.findById(id); 
        if (task == null) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        taskRepository.delete(task);
        return Response.noContent().build();
    }



}
