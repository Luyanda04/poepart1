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

        System.out.println(" efirst name");
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
public boolean checkPasswordComplexity(String password) {
        boolean complexity = false;
        boolean complexity2 = false;
        boolean complexity3 = false;
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) >= 65 && password.charAt(i) <= 90) {
                complexity = true;
            }
            if (password.charAt(i) >= 48 && password.charAt(i) <= 57) {
                complexity2 = true;
            }

            if ((password.charAt(i) >= 32 && password.charAt(i) <= 47) || (password.charAt(i) >= 58 && password.charAt(i) <= 64) || (password.charAt(i) >= 91 && password.charAt(i) <= 96) || (password.charAt(i) >= 123 && password.charAt(i) <= 127)) {
                complexity3 = true;
            }
        }
        if (complexity == true && complexity2 == true && complexity3 == true && password.length() >= 8) {
            System.out.println("Password complexity successfully captured. Please proceed to login");
        } else {
            System.out.println("Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number, and a special character");
        }
        return true;
    }  