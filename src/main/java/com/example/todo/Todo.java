// Write your code here
package com.example.todo;

public class Todo{
    private int id;
    private String todoName;
    private String priority;
    private String status;

    public Todo(int id,String name,String priority,String status){
        this.id=id;
        todoName=name;
        this.priority=priority;
        this.status=status;
    }

    public int getId(){
        return id;
    }

    public String getTodo(){
        return todoName;
    }

    public String getPriority(){
        return priority;
    }

    public String getStatus(){
        return status;
    }

    public void setId(int id){
        this.id=id;
    }

    public void setTodo(String todoName){
        this.todoName=todoName;
    }

    public void setPriority(String priority){
        this.priority=priority;
    }

    public void setStatus(String status){
        this.status=status;
    }
}