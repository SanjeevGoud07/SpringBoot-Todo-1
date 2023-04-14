// Write your code here

package com.example.todo;

import java.util.*;
import com.example.todo.Todo;


public interface TodoRepository{
     ArrayList<Todo> getTodos();

     Todo getTodoById(int id);

     Todo addTodo(Todo todo1);

     Todo updateTodo(int id,Todo todo1);

     Todo deleteTodo(int id);
}