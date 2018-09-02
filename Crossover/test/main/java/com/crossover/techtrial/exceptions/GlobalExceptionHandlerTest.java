/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.com.crossover.techtrial.exceptions;

import java.util.AbstractMap;
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
public class GlobalExceptionHandlerTest {
    
    public GlobalExceptionHandlerTest() {
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
     * Test of handle method, of class GlobalExceptionHandler.
     */
    @Test
    public void testHandle() {
        System.out.println("handle");
        Exception exception = null;
        GlobalExceptionHandler instance = new GlobalExceptionHandler();
        ResponseEntity<AbstractMap.SimpleEntry<String, String>> expResult = null;
        ResponseEntity<AbstractMap.SimpleEntry<String, String>> result = instance.handle(exception);
        assertEquals(expResult, result);

    }
    
}
