/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main.java.com.crossover.techtrial.controller;

import java.util.List;
import main.java.com.crossover.techtrial.model.Person;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.http.ResponseEntity;

/**
 *
 * @author JAY
 */
public class PersonControllerTest {
    
    public PersonControllerTest() {
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
     * Test of register method, of class PersonController.
     */
    @Test
    public void testRegister() {
        System.out.println("register");
        Person p = null;
        PersonController instance = new PersonController();
        ResponseEntity<Person> expResult = null;
        ResponseEntity<Person> result = instance.register(p);
        assertEquals(expResult, result);
    }

    /**
     * Test of getAllPersons method, of class PersonController.
     */
    @Test
    public void testGetAllPersons() {
        System.out.println("getAllPersons");
        PersonController instance = new PersonController();
        ResponseEntity<List<Person>> expResult = null;
        ResponseEntity<List<Person>> result = instance.getAllPersons();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPersonById method, of class PersonController.
     */
    @Test
    public void testGetPersonById() {
        System.out.println("getPersonById");
        Long personId = null;
        PersonController instance = new PersonController();
        ResponseEntity<Person> expResult = null;
        ResponseEntity<Person> result = instance.getPersonById(personId);
        assertEquals(expResult, result);
    }
    
}
