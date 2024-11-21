/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poepart1and2;

import java.util.Scanner;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import java.util.ArrayList;


/**
 *
 * @author RC_Student_lab
 */
public class POEPART1AND2 
{public static void main(String[] args) {
    final JDialog dialog = new JDialog();
    dialog.setAlwaysOnTop(true);

    // Pass the external class
    Login log = new Login();
    classtask taskManager = null;

    // Declarations
    String firstname;
    String lastname;
    String username;
    String password;

    // Create a scanner object
    Scanner input = new Scanner(System.in);

    // Prompt user for registration
    System.out.println("Enter firstname:  ");
    firstname = input.next();
    log.setfirstname(firstname);

    System.out.println("Enter lastname:   ");
    lastname = input.next();
    log.setlastname(lastname);

    System.out.println("Enter username:   ");
    username = input.next();
    log.setusername(username);

    System.out.println("Enter password");
    password = input.next();
    log.setpassword(password);

    // Register user
    String registration = log.registeruser(firstname, lastname, username, password);
    System.out.println("Registration: " + registration);

    // Login user
    if (registration.equals("the two above conditions have been met and user has been registered successfully")) {
        System.out.println("Enter username to login: ");
        username = input.next();
        System.out.println("Enter password to login: ");
        password = input.next();

        boolean loginSuccessful = log.loginuser(firstname, lastname, username, password);
        String loginMessage = log.returnLoginStatus(loginSuccessful);
        System.out.println(loginMessage);

        if (!loginSuccessful) {
            System.exit(0);
        }

        // Main menu for EasyKanban
        JOptionPane.showMessageDialog(null, "Welcome to EasyKanban");
        int menuOption = 0;

        // Initialize task manager after login
        int numberofTASKS = Integer.parseInt(JOptionPane.showInputDialog("How many tasks do you wish to record?"));
        taskManager = new classtask(numberofTASKS);

        while (true) {
            menuOption = Integer.parseInt(JOptionPane.showInputDialog(
                "Select an option:\n" +
                "1: Add tasks\n" +
                "2: Display tasks with status 'Done'\n" +
                "3: Display task with longest duration\n" +
                "4: Search for a task by name\n" +
                "5: Search for tasks assigned to a developer\n" +
                "6: Delete a task by name\n" +
                "7: Display report of all tasks\n" +
                "8: Quit"));

            switch (menuOption) {
                case 1: // Add Tasks
                    for (int i = 0; i < numberofTASKS; i++) {
                        String taskName = JOptionPane.showInputDialog("Enter Task Name:");
                        String taskDescription;
                        do {
                            taskDescription = JOptionPane.showInputDialog("Enter Task Description (max 50 characters):");
                        } while (!taskManager.checkDescription(taskDescription));
                        String developer = JOptionPane.showInputDialog("Enter Developer Details (First and Last Name):");
                        int duration = Integer.parseInt(JOptionPane.showInputDialog("Enter Task Duration (in hours):"));
                        String[] statuses = {"To Do", "Doing", "Done"};
                        int statusIndex = JOptionPane.showOptionDialog(null, "Choose Task Status:", "Task Status",
                                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, statuses, statuses[0]);
                        String status = statuses[statusIndex];

                        taskManager.addTask(taskName, taskDescription, developer, duration, status);
                        taskManager.printTaskDetails(i);
                    }
                    break;

                case 2: // Display tasks with status 'Done'
                    taskManager.displayTasksWithStatus("Done");
                    break;

                case 3: // Display task with longest duration
                    taskManager.displayLongestTask();
                    break;

                case 4: // Search for a task by name
                    String searchName = JOptionPane.showInputDialog("Enter the Task Name to search:");
                    taskManager.searchTaskByName(searchName);
                    break;

                case 5: // Search for tasks assigned to a developer
                    String searchDeveloper = JOptionPane.showInputDialog("Enter the Developer Name to search tasks:");
                    taskManager.displayTasksWithStatus(searchDeveloper);
                    break;

                case 6: // Delete a task by name
                    String deleteName = JOptionPane.showInputDialog("Enter the Task Name to delete:");
                    taskManager.deleteTaskByName(deleteName);
                    break;

                case 7: // Display full report of all tasks
                    taskManager.displayReport();
                    break;

                case 8: // Quit
                    JOptionPane.showMessageDialog(null, "Thank you! Goodbye.");
                    System.exit(0);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Invalid option, please choose a valid option.");
                    break;
            }
        }
    } else {
        JOptionPane.showMessageDialog(null, "Registration failed. Exiting the program.");
    }
}
}


    
    
        

       

    

