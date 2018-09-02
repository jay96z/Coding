/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.com.crossover.techtrial.service;

import java.util.List;
import main.java.com.crossover.techtrial.model.Person;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JAY
 */
public class PersonServiceImplTest {
    
    public PersonServiceImplTest() {
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
     * Test of getAll method, of class PersonServiceImpl.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        PersonServiceImpl instance = new PersonServiceImpl();
        List<Person> expResult = null;
        List<Person> result = instance.getAll();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of save method, of class PersonServiceImpl.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        Person p = null;
        PersonServiceImpl instance = new PersonServiceImpl();
        Person expResult = null;
        Person result = instance.save(p);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of findById method, of class PersonServiceImpl.
     */
    @Test
    public void testFindById() {
        System.out.println("findById");
        Long personId = null;
        PersonServiceImpl instance = new PersonServiceImpl();
        Person expResult = null;
        Person result = instance.findById(personId);
        assertEquals(expResult, result);
      
    }
    
}
