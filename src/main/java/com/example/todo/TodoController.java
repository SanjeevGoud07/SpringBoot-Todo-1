    /*
    * You can use the following import statements
    * 
    * import org.springframework.web.bind.annotation.*;
    * import java.util.ArrayList;
    * 
    */

    // Write your code here.
    package com.example.todo;

    import org.springframework.web.bind.annotation.*;
    import java.util.*;
    import com.example.todo.TodoService;
    import com.example.todo.Todo;

    @RestController

    public class TodoController{

    TodoService todoServ=new TodoService();

    @GetMapping("/todos")

    public ArrayList<Todo> getTodos(){
        return todoServ.getTodos();
    }

    @GetMapping("/todos/{id}")

    public Todo getTodoById(@PathVariable("id") int id){
        return todoServ.getTodoById(id);
    }

    @PostMapping("/todos")

    public Todo addTodo(@RequestBody Todo todo1){
        return todoServ.addTodo(todo1);
    }

    @PutMapping("/todos/{id}")

    public Todo updateTodo(@PathVariable("id") int id,@RequestBody Todo todo1){
        return todoServ.updateTodo(id,todo1);
    }

    @DeleteMapping("todos/{id}")

    public Todo deleteTodo(@PathVariable("id") int id){
        return todoServ.deleteTodo(id);
    }
    }