/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poepart1and2;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author RC_Student_lab
 */
public class TaskManager {
  
    private String[] developers;
    private String[] taskNames;
    private String[] taskIDs;
    private int[] taskDurations;
    private String[] taskStatuses;
    private int taskCount;

    // Constructor to initialize the arrays
    public TaskManager(int maxTasks) {
        developers = new String[maxTasks];
        taskNames = new String[maxTasks];
        taskIDs = new String[maxTasks];
        taskDurations = new int[maxTasks];
        taskStatuses = new String[maxTasks];
        taskCount = 0;
    }

    // Check if task description length is valid
    public boolean checkDescription(String description) {
        if (description.length() > 50) {
            JOptionPane.showMessageDialog(null, "Please enter a task description of less than 50 characters.");
            return false;
        }
        return true;
    }

    // Add a task to the arrays
    public void addTask(String taskName, String taskDescription, String developer, int duration, String status) {
        String taskID = generateTaskID(taskName, taskCount, developer);
        taskNames[taskCount] = taskName;
        developers[taskCount] = developer;
        taskIDs[taskCount] = taskID;
        taskDurations[taskCount] = duration;
        taskStatuses[taskCount] = status;
        taskCount++;
    }

    // Generate a Task ID based on naming conventions
    private String generateTaskID(String taskName, int taskNumber, String developer) {
        return taskName.substring(0, 2).toUpperCase() + ":" + taskNumber + ":" +
                developer.substring(developer.length() - 3).toUpperCase();
    }

    // Print task details for a given index
    public void printTaskDetails(int index) {
        JOptionPane.showMessageDialog(null, 
            "Task Details:\n" +
            "Status: " + taskStatuses[index] + "\n" +
            "Developer: " + developers[index] + "\n" +
            "Task Number: " + index + "\n" +
            "Task Name: " + taskNames[index] + "\n" +
            "Task ID: " + taskIDs[index] + "\n" +
            "Duration: " + taskDurations[index] + " hrs");
    }

    // Calculate total task hours
    public int getTotalHours() {
        int total = 0;
        for (int i = 0; i < taskCount; i++) {
            total += taskDurations[i];
        }
        return total;
    }

    // Display tasks with a specific status
    public void displayTasksWithStatus(String status) {
        StringBuilder result = new StringBuilder("Tasks with status '" + status + "':\n");
        for (int i = 0; i < taskCount; i++) {
            if (taskStatuses[i].equalsIgnoreCase(status)) {
                result.append("Developer: ").append(developers[i])
                      .append(", Task Name: ").append(taskNames[i])
                      .append(", Duration: ").append(taskDurations[i]).append(" hrs\n");
            }
        }
        JOptionPane.showMessageDialog(null, result.toString());
    }

    // Display the task with the longest duration
    public void displayLongestTask() {
        int longestIndex = 0;
        for (int i = 1; i < taskCount; i++) {
            if (taskDurations[i] > taskDurations[longestIndex]) {
                longestIndex = i;
            }
        }
        JOptionPane.showMessageDialog(null, 
            "Longest Task:\nDeveloper: " + developers[longestIndex] + 
            ", Duration: " + taskDurations[longestIndex] + " hrs");
    }

    // Search for a task by name
    public void searchTaskByName(String taskName) {
        for (int i = 0; i < taskCount; i++) {
            if (taskNames[i].equalsIgnoreCase(taskName)) {
                JOptionPane.showMessageDialog(null, 
                    "Task Found:\nTask Name: " + taskNames[i] + 
                    "\nDeveloper: " + developers[i] + 
                    "\nStatus: " + taskStatuses[i]);
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Task not found.");
    }

    // Delete a task by name
    public void deleteTaskByName(String taskName) {
        for (int i = 0; i < taskCount; i++) {
            if (taskNames[i].equalsIgnoreCase(taskName)) {
                // Shift tasks to fill the gap
                for (int j = i; j < taskCount - 1; j++) {
                    developers[j] = developers[j + 1];
                    taskNames[j] = taskNames[j + 1];
                    taskIDs[j] = taskIDs[j + 1];
                    taskDurations[j] = taskDurations[j + 1];
                    taskStatuses[j] = taskStatuses[j + 1];
                }
                taskCount--;
                JOptionPane.showMessageDialog(null, "Task '" + taskName + "' deleted successfully.");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Task not found.");
    }

    // Display a full task report
    public void displayReport() {
        StringBuilder report = new StringBuilder("Task Report:\n");
        for (int i = 0; i < taskCount; i++) {
            report.append("Task ID: ").append(taskIDs[i])
                  .append(", Developer: ").append(developers[i])
                  .append(", Task Name: ").append(taskNames[i])
                  .append(", Status: ").append(taskStatuses[i])
                  .append(", Duration: ").append(taskDurations[i]).append(" hrs\n");
        }
        JOptionPane.showMessageDialog(null, report.toString());
    }
}


    

    