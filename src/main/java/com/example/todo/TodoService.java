/*
 
* You can use the following import statements
 
 * import org.springframework.web.server.ResponseStatusException;
 * import org.springframework.http.HttpStatus;
 
 */

package com.example.todo;

import com.example.todo.Todo;
import com.example.todo.TodoRepository;
import java.util.*;

import javax.validation.constraints.Null;

import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;
// Don't modify the below code

public class TodoService implements TodoRepository {

    private static HashMap<Integer, Todo> todoList = new HashMap<>();
	int uniqueId=5;
    public TodoService() {
        todoList.put(1, new Todo(1, "Watch Movie", "LOW", "TO DO"));
        todoList.put(2, new Todo(2, "Finish Project", "HIGH", "IN PROGRESS"));
        todoList.put(3, new Todo(3, "Buy Groceries", "MEDIUM", "TO DO"));
        todoList.put(4, new Todo(4, "Learning from NxtWave", "HIGH", "IN PROGRESS"));
        todoList.put(5, new Todo(5, "Go for a Run", "MEDIUM", "DONE"));

    }

    // Don't modify the above code

    // Write your code here
    @Override
    public ArrayList<Todo> getTodos(){
        Collection<Todo> todos=todoList.values();
        ArrayList<Todo> todosDet=new ArrayList<>(todos);
        return todosDet;
    }

    @Override

    public Todo getTodoById(int Id){
        Todo todo1=todoList.get(Id);
        if(todo1==null){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return todo1;
    }

    @Override
    public Todo addTodo(Todo todo1){
        uniqueId+=1;
        todo1.setId(uniqueId);
        todoList.put(uniqueId,todo1);
        
        return todo1;
    }
     @Override

     public Todo updateTodo(int Id,Todo todo1){
        Todo existingTodo=todoList.get(Id);
        if(existingTodo==null){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        if(todo1.getTodo()!=null){
            existingTodo.setTodo(todo1.getTodo());
        }
        if(todo1.getPriority()!=null){
            existingTodo.setPriority(todo1.getPriority());
            }
        if(todo1.getStatus()!=null){
            existingTodo.setStatus(todo1.getStatus());
        }
        return existingTodo;
     }

     @Override

     public Todo deleteTodo(int Id){
        Todo existingTodo=todoList.get(Id);
        if(existingTodo==null){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        else{
            todoList.remove(Id);
            throw new ResponseStatusException(HttpStatus.NO_CONTENT);
        }
     }
}
