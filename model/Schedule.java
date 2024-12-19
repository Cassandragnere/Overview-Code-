package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Schedule {

    private int id;
    private LocalDate date;
    private List<Task> tasks;



    public Schedule(int id, LocalDate date, List<Task> tasks) {
        this.id=id;
        this.date = date;
        this.tasks = tasks;

    }
// Getters and setters
    public int getId(){
        return id;
    }

    public LocalDate getDate() {

        return date;
    }

    public void setDate(LocalDate date){

        this.date=date;
    }

    public List<Task> getTasks(){

        return tasks;
    }

    public void setTasks(List<Task> tasks) {

        this.tasks = tasks;
    }
//Adds task to ArrayList
    public void addTasks(Task task){
        if (tasks == null) {
            tasks = new ArrayList<>();
        }
        tasks.add(task);
    }
    public List<Task> getTasksForDate(LocalDate date) {
        if (this.date.equals(date)) {
            return tasks;
        }
        return new ArrayList<>();
    }
    public String toString(){
        return "Localdate: " + date + "Task list: " + tasks;
    }


 }
