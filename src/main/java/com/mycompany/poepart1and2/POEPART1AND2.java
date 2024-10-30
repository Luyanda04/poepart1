/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poepart1and2;

import java.util.Scanner;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_lab
 */
public class POEPART1AND2 {

    public static void main(String[] args) {
        final JDialog dialog = new JDialog();
       dialog.setAlwaysOnTop(true);
       // TODO code application logic here
        //pass the external class
        Login log= new Login();
         
       
        
        //decalarations
        String firstname;
        String lastname;
        String username;
        String password;
        
        //create an object of the scanner;
        Scanner input=new Scanner(System.in);
        
        //prompt the user to enter the firstname,lastname,username,password
        System.out.println("Enter firstname:  ");
        firstname=input.next();
        log.setfirstname(firstname);
        
        System.out.println("Enter lastname:   ");
        lastname=input.next();
        log.setlastname(lastname);
        
        System.out.println("Enter username:   ");
        username=input.next();
        log.setusername(username);
        
        System.out.println("Enter password");
        password=input.next();
        log.setpassword(password);
        
        //register the user
        String registration=log.registeruser(firstname,lastname,username,password);
        System.out.println("registration: "+ registration);
        
        //login user
        if(registration.equals("the two above conditions have been met and user has been registered successfully")){
        System.out.println("Enter username to login: ");
        username=input.next();
        System.out.println("Enter password to login: ");
        password=input.next();
        
        //display login status
        boolean loginSuccesful=log.loginuser(firstname, lastname, username, password);
        String loginMessage=log.returnLoginStatus(loginSuccesful);
        System.out.println(loginMessage);
        
    
    
        // TODO code application logic here
        // Login functionality
       

        if (username.equals("admin") && password.equals("password")) {
            // Welcome message
            JOptionPane.showMessageDialog(null, "Welcome to EasyKanban");
        }
      
       int menuOption = 0;
        
      
        JOptionPane.showMessageDialog(null, "Welcome To EasyKanBan");
        while ( true) {
             menuOption = Integer.parseInt(JOptionPane.showInputDialog("Select an option :\n1: Add tasks\n2: Show report\n3: Quit"));

            switch ( menuOption) {
                case 1:
                     int total = 0;
        
                    int numberofTASKS = Integer.parseInt(JOptionPane.showInputDialog("How many tasks do you wish to record?"));

                    classtask task = new classtask(numberofTASKS);  // Initialize the task manager with the number of tasks

                    for (int i = 0; i < numberofTASKS; i++) {
                        // Task name input
                        String taskName = JOptionPane.showInputDialog("Enter Task name: ");

                        // Task description input with validation
                        String taskDescription;
                        do {
                            taskDescription = JOptionPane.showInputDialog("Enter Task Description for (should not exceed  50 characters): " );
                        } while (!task.checkDescription(taskDescription));  // Check length validation

                        // Developer details input
                        String developerDetail = JOptionPane.showInputDialog("Enter Developer Details (First and Last name): ");

                        // Task duration input
                        int taskDuration = Integer.parseInt(JOptionPane.showInputDialog("Enter Task Duration (in hours): " ));

                        // Task status selection
                        String[] Options = { "To Do", "Doing", "Done" };
                        int status = JOptionPane.showOptionDialog(null,
                                "Choose a status "  + ":",
                                "Task Status",
                                JOptionPane.DEFAULT_OPTION,
                                JOptionPane.INFORMATION_MESSAGE,
                                null,
                                Options,
                                Options[0]);
                        String taskStatus = Options[status];

                        // Add the task to the task manager
                        task.addTask(taskName, taskDescription, developerDetail, taskDuration, taskStatus);

                        // Display task details
                        task.printTaskDetails(i);
                    }

                    // Calculate total hours
                    total= task.getTotalHours();
                    JOptionPane.showMessageDialog(null, "The total hours of all the tasks performed: " +  total + " hrs");
                    break;

                case 2:
                   JOptionPane.showMessageDialog(null, "coming soon!!!!");
                    break;

                case 3:
                    JOptionPane.showMessageDialog(null, "thank you bye");
                    System.exit(0);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Invalid option, please choose the correct the option.");
                    break;
            }
        
    
    }
        
    }
    }
}
