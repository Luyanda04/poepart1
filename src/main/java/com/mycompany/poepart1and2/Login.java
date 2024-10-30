/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poepart1and2;

/**
 *
 * @author RC_Student_lab
 */
public class Login {
     private String firstname;
    private String lastname;
    private String username;
    private String password;

    
    
    //setter and getters
    public String getfirstname(){
    return firstname;
    }
    public void setfirstname(String firstname){
    this.firstname=firstname;
    }
    public String getlastname(){
    return lastname;
    }
    public void setlastname(String lastname){
    this.lastname=lastname;
    }
    public String getusername(){
    return username;
    }
    public void setusername(String username){
    this.username=username;
    }
    public String getpassword(){
    return password;
    }
    public void setpassword(String password){
    this.password=password;
    }
    //method to check the username
    public boolean checkusername(String username){
    //check if the user name meets the conditions
    return username.contains("_") && username.length()<=5;
    }
    //method to check for password
    public boolean checkpasswordcomplexity(String password){
    //check if the password is complex
    return password.length()<=8 && password.matches(".*[A-Z].*") &&password.matches(".*[0-9].*")&&password.matches(".*[!@#$%^&*().]*");
    }
    //method to register the user
    public String registeruser(String firstname,String lastname,String username,String password){
    if(!checkusername(username)){
    return "The username is incorrectly formatted.";
    }
    if(!checkpasswordcomplexity(password)){
    return "the password does not meet the complexity requirements.";
    }
    return "the two above conditions have been met and user has been registered successfully";
    }
    //method to verify thelogin details
    public boolean loginuser(String firstname,String lastname,String username,String password){
        return username.equals(this.username) && password.equals(this.password);
    }
    public String returnLoginStatus(boolean successfulLogin){
        if (successfulLogin){
             return "welcome "+getfirstname()+" "+ getlastname()+",it is great to see you again.";
        }
    else{
        return ("username or password incorrect, try again");
    }
    }
}
