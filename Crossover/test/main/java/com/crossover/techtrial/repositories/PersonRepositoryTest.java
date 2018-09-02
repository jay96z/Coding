/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.com.crossover.techtrial.repositories;

import java.util.Optional;
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
public class PersonRepositoryTest {
    
    public PersonRepositoryTest() {
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
     * Test of findById method, of class PersonRepository.
     */
    @Test
    public void testFindById() {
        System.out.println("findById");
        Long id = null;
        PersonRepository instance = new PersonRepositoryImpl();
        Optional<Person> expResult = null;
        Optional<Person> result = instance.findById(id);
        assertEquals(expResult, result);
     
    }

    /**
     * Test of save method, of class PersonRepository.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        Person p = null;
        PersonRepository instance = new PersonRepositoryImpl();
        Person expResult = null;
        Person result = instance.save(p);
        assertEquals(expResult, result);
 
    }

    /**
     * Test of findAll method, of class PersonRepository.
     */
    @Test
    public void testFindAll() {
        System.out.println("findAll");
        PersonRepository instance = new PersonRepositoryImpl();
        Object expResult = null;
        Object result = instance.findAll();
        assertEquals(expResult, result);
    
    }

    public class PersonRepositoryImpl implements PersonRepository {

        public Optional<Person> findById(Long id) {
            return null;
        }

        public Person save(Person p) {
            return null;
        }

        public Object findAll() {
            return null;
        }
    }
    
}
