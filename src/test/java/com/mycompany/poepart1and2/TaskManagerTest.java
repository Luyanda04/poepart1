/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.poepart1and2;
import static java.lang.ref.Cleaner.create;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author RC_Student_lab
 */
public class TaskManagerTest {
    

    private TaskManager taskManager;

    @Before
    void setUp() {
        // Initialize TaskManager with a maximum of 10 tasks
        taskManager = new TaskManager(10);
    }

    @Test
    void testAddTask() {
        taskManager.addTask("Task1", "Description", "JohnDoe", 5, "To Do");
        assertEquals(1, taskManager.getTotalHours());
    }

    @Test
    void testCheckDescriptionValid() {
        boolean isValid = taskManager.checkDescription("Short description");
        assertTrue(isValid);
    }

    @Test
    void testCheckDescriptionInvalid() {
        boolean isValid = taskManager.checkDescription("This description is way too long and should return false as it is more than fifty characters.");
        assertFalse(isValid);
    }

    @Test
    void testGenerateTaskID() {
        taskManager.addTask("Task2", "Some description", "JaneSmith", 3, "In Progress");
        String expectedID = "TA:0:ITH";
        //assertEquals(expectedID, taskManager.taskID()[0]);  // Assuming getTaskIDs() is a getter for taskIDs array
    }

    @Test
    void testDisplayTasksWithStatus() {
        taskManager.addTask("Task1", "Description", "JohnDoe", 5, "To Do");
        taskManager.addTask("Task2", "Another Description", "JaneDoe", 3, "Done");
        taskManager.addTask("Task3", "Yet Another Description", "JakeSmith", 2, "To Do");

        // Capture output
        taskManager.displayTasksWithStatus("To Do");
        // Visual inspection is needed to verify the correctness as JOptionPane is used for display
    }

    @Test
    void testGetTotalHours() {
        taskManager.addTask("Task1", "Description", "JohnDoe", 5, "To Do");
        taskManager.addTask("Task2", "Another Description", "JaneDoe", 3, "Done");
        assertEquals(8, taskManager.getTotalHours());
    }

    @Test
    void testDisplayLongestTask() {
        taskManager.addTask("Task1", "Description", "JohnDoe", 5, "To Do");
        taskManager.addTask("Task2", "Another Description", "JaneDoe", 10, "In Progress");
        taskManager.addTask("Task3", "Yet Another Description", "JakeSmith", 2, "Done");

        // Capture output
        taskManager.displayLongestTask();
        // Visual inspection is needed to verify the correctness as JOptionPane is used for display
    }

    @Test
    void testSearchTaskByName() {
        taskManager.addTask("Task1", "Description", "JohnDoe", 5, "To Do");
        taskManager.addTask("Task2", "Another Description", "JaneDoe", 3, "Done");

        // Capture output
        taskManager.searchTaskByName("Task1");
        // Visual inspection is needed to verify the correctness as JOptionPane is used for display
    }

    @Test
    void testDeleteTaskByName() {
        taskManager.addTask("Task1", "Description", "JohnDoe", 5, "To Do");
        taskManager.addTask("Task2", "Another Description", "JaneDoe", 3, "Done");

        taskManager.deleteTaskByName("Task1");

        // Confirm that the task was deleted by checking the total hours
        assertEquals(3, taskManager.getTotalHours());
    }

    @Test
    void testDisplayReport() {
        taskManager.addTask("Task1", "Description", "JohnDoe", 5, "To Do");
        taskManager.addTask("Task2", "Another Description", "JaneDoe", 3, "Done");

        // Capture output
        taskManager.displayReport();
        // Visual inspection is needed to verify the correctness as JOptionPane is used for display
    }
}
  
