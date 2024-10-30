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
public class classtaskTest {
    
    public classtaskTest() {
    }

    @org.junit.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.junit.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }
    
    

    /**
     * Test of checkDescription method, of class class task.
     */
    @org.junit.Test
    public void testCheckDescription1() {
        System.out.println("checkDescription");
        String description = "Create Login to authenticate user";
        int num = 0;
        classtask instance = new classtask(num);
        boolean expResult = true;
        boolean result = instance.checkDescription(description);
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of createTaskID method, of class class task.
     */
    @org.junit.Test
    public void testCreateTaskID1() {
        System.out.println("createTaskID");
        String taskName = "Login feature";
        int taskNumber = 0;
        String developerDetails = "luyanda joloza";
        classtask instance = new classtask(taskNumber);
        String expResult = "LO:0:SON";
        String result = instance.createTaskID(taskName, taskNumber, developerDetails);
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of addTask method, of class class task.
     */
    @org.junit.Test
    public void testAddTask() {
        System.out.println("addTask");
        String taskName = "Login feature";
        String taskDescription = "easy khamban";
        String developerDetail = "luyanda joloza";
        int taskDuration = 0;
        String taskStatus = "lulu";
        classtask instance = new classtask(taskDuration);
        instance.addTask(taskName, taskDescription, developerDetail, taskDuration, taskStatus);
        
        
    }

    /**
     * Test of printTaskDetails method, of class class task.
     */
    @org.junit.Test
    public void testPrintTaskDetails() {
        System.out.println("printTaskDetails");
        int taskNumber = 0;
        String taskName= "login feature";
        String description="Create login to authenticate users";
        String taskID="";
        classtask instance = new classtask(taskNumber);
        instance.printTaskDetails(taskNumber);
        
        
    }

    /**
     * Test of getTotalHours method, of class class task.
     */
    @org.junit.Test
    public void testGetTotalHours1() {
        System.out.println("getTotalHours");
        int hours = 9;
        int taskNumber = 0;
        classtask instance = new classtask(taskNumber);
        int expResult = 9;
        int result = instance.getTotalHours();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of getTaskCount method, of class class task.
     */
    @org.junit.Test
    public void testGetTaskCount() {
        System.out.println("getTaskCount");
        int taskNumber = 0;
        classtask instance = new classtask(taskNumber);
        int expResult = 9;
        int result = instance.getTaskCount();
        assertEquals(expResult, result);
       
        
    }
    
}
