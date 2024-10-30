/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.poepart1and2;

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
public class LoginTest {
    
    public LoginTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getfirstname method, of class Login.
     */
    @Test
    public void testGetfirstname() {
        System.out.println("getfirstname");
        Login instance = new Login();
        String expResult = "luyanda";
        String result = instance.getfirstname();
        assertEquals(expResult, result);
       
       
    }

    /**
     * Test of setfirstname method, of class Login.
     */
    @Test
    public void testSetfirstname() {
        System.out.println("setfirstname");
        String firstname = "luyanda";
        Login instance = new Login();
        instance.setfirstname(firstname);
        
        
    }

    /**
     * Test of getlastname method, of class Login.
     */
    @Test
    public void testGetlastname() {
        System.out.println("getlastname");
        Login instance = new Login();
        String expResult = "joloza";
        String result = instance.getlastname();
        assertEquals(expResult, result);
       
        
    }

    /**
     * Test of setlastname method, of class Login.
     */
    @Test
    public void testSetlastname() {
        System.out.println("setlastname");
        String lastname = "joloza";
        Login instance = new Login();
        instance.setlastname(lastname);
        
        
    }

    /**
     * Test of getusername method, of class Login.
     */
    @Test
    public void testGetusername() {
        System.out.println("getusername");
        Login instance = new Login();
        String expResult = "jet_";
        String result = instance.getusername();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of set username method, of class Login.
     */
    @Test
    public void testSetusername() {
        System.out.println("setusername");
        String username = "jet_";
        Login instance = new Login();
        instance.setusername(username);
        
        
    }

    /**
     * Test of get password method, of class Login.
     */
    @Test
    public void testGetpassword() {
        System.out.println("getpassword");
        Login instance = new Login();
        String expResult = "Pass123@";
        String result = instance.getpassword();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of set password method, of class Login.
     */
    @Test
    public void testSetpassword() {
        System.out.println("setpassword");
        String password = "Pass123@";
        Login instance = new Login();
        instance.setpassword(password);
        
        
    }

    /**
     * Test of check username method, of class Login.
     */
    @Test
    public void testCheckusername() {
        System.out.println("checkusername");
        String username = "jet_";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.checkusername(username);
        assertEquals(expResult, result);
        
       
    }

    /**
     * Test of check passwordcomplexity method, of class Login.
     */
    @Test
    public void testCheckpasswordcomplexity() {
        System.out.println("checkpasswordcomplexity");
        String password = "Pass123@";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.checkpasswordcomplexity(password);
        assertEquals(expResult, result);
      
        
    }

    /**
     * Test of register user method, of class Login.
     */
    @Test
    public void testRegisteruser() {
        System.out.println("registeruser");
        String firstname = "luyanda";
        String lastname = "joloza";
        String username = "jet_";
        String password = "Pass123@";
        Login instance = new Login();
        String expResult = "true";
        String result = instance.registeruser(firstname, lastname, username, password);
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of login user method, of class Login.
     */
    @Test
    public void testLoginuser() {
        System.out.println("loginuser");
        String firstname = "luyanda";
        String lastname = "joloza";
        String username = "jet_";
        String password = "Pass123@";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.loginuser(firstname, lastname, username, password);
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of returnLoginStatus method, of class Login.
     */
    @Test
    public void testReturnLoginStatus() {
        System.out.println("returnLoginStatus");
        boolean successfulLogin = false;
        Login instance = new Login();
        String expResult = "";
        String result = instance.returnLoginStatus(successfulLogin);
        assertEquals(expResult, result);
       
        
    }
    
}
