package com.iamnoahl.cfsbpsql.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TodoController {

    @Autowired
    private TodoRepository todoRepository;

    @GetMapping("/todo")
    public List<TodoModel> getAllTodos(){
        return todoRepository.findAll();
    }

    @PostMapping("/todo")
    public TodoModel createTodo(TodoModel todo) {
        return todoRepository.save(todo);
    }
}
