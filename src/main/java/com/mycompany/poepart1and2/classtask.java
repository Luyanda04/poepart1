/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poepart1and2;

import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_lab
 */
public class classtask {
private String[] taskNames;
    private String[] taskDescriptions;
    private String[] developerDetails;
    private String[] taskIDs;
    private int[] taskDurations;
    private String[] taskStatuses;
    private int Count = 0; // 

   
    public classtask(int numberOftasks) {
        taskNames = new String[numberOftasks];
        taskDescriptions = new String[numberOftasks];
        developerDetails = new String[numberOftasks];
        taskIDs = new String[numberOftasks];
        taskDurations = new int[numberOftasks];
        taskStatuses = new String[numberOftasks];
    }

    public boolean checkDescription(String description) {
        if (description.length() <= 50) {
            JOptionPane.showMessageDialog(null, "Task description is successfully captured");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Task description should not exceed 50 characters");
            return false;
        }
    }

    public String createTaskID(String taskName, int taskNumber, String developerDetails) {
        return taskName.substring(0, 2).toUpperCase() + ":" + taskNumber + ":" + developerDetails.substring(developerDetails.length() - 3).toUpperCase();
    }

    public void addTask(String taskName, String taskDescription, String developerDetail, int taskDuration, String taskStatus) {
        if (Count >= taskNames.length) {
            JOptionPane.showMessageDialog(null, "Cannot add more tasks. Maximum limit reached.");
            return;
        }
        
        taskNames[Count] = taskName;
        taskDescriptions[Count] = taskDescription;
        developerDetails[Count] = developerDetail;
        taskDurations[Count] = taskDuration;
        taskStatuses[Count] = taskStatus;
        taskIDs[Count] = createTaskID(taskName, Count, developerDetail);
        Count++;
    }

    public void printTaskDetails(int taskNumber) {
        String details = "** Task Details **\n"
                + "Task Status: " + taskStatuses[taskNumber] + "\n"
                + "Developer Details: " + developerDetails[taskNumber] + "\n"
                + "Task Number: " + taskNumber + "\n"
                + "Task Name: " + taskNames[taskNumber] + "\n"
                + "Task Description: " + taskDescriptions[taskNumber] + "\n"
                + "Task ID: " + taskIDs[taskNumber] + "\n"
                + "Task Duration: " + taskDurations[taskNumber] + " hrs\n"
                + "*********\n";
        JOptionPane.showMessageDialog(null, details);
    }

   
    public int getTotalHours() {
        int total = 0;
        for (int i = 0; i < Count; i++) {
            total += taskDurations[i];
        }
        return total;
    }

    public int getTaskCount() {
        return Count;
    }    

    void displayTasksWithStatus(String done) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void displayLongestTask() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void searchTaskByName(String searchName) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void deleteTaskByName(String deleteName) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void displayReport() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
