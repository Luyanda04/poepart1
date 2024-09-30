/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package anada.one;

import java.util.Scanner;

public class AnadaOne {
    

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        AnadaOne bnn = new AnadaOne();

        String userName;
        String firstName;
        String lastName;
        String loginUserName;
        String loginPassword;
        String password;

        System.out.println("Enter your first name");
        firstName = input.nextLine();

        System.out.println("Enter your last name");
        lastName = input.nextLine();

        System.out.println("Enter your username");
        userName = input.nextLine();

        System.out.println(bnn.checkUserName(userName));

        System.out.println("Enter password");
        password = input.nextLine();

        System.out.println(bnn.checkPasswordComplexity(password));


        System.out.println(bnn.registerUser(password, userName));

        System.out.println("Enter your username");
        loginUserName = input.nextLine();

        System.out.println("Enter your password");
        loginPassword = input.nextLine();

        System.out.println(bnn.loginUser(loginUserName, userName, loginPassword, password));

        System.out.println(bnn.returnLoginStatus(loginUserName, userName, loginPassword, 

password, firstName, lastName));
    }

public boolean checkUserName(String username) {
        boolean underscore = false;
        for (int i = 0; i < username.length(); i++) {
            if (username.charAt(i) == '_') {
                underscore = true;
            }
        }
        if (underscore == true && username.length() <= 5) {
            System.out.println("Username successfully captured");
        } else {
            System.out.println("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length");
        }
        return true;
    }
   
    

