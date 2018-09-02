/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.com.crossover.techtrial.dto;

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
public class TopDriverDTOTest {
    
    public TopDriverDTOTest() {
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
     * Test of getName method, of class TopDriverDTO.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        TopDriverDTO instance = new TopDriverDTO();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);

    }

    /**
     * Test of setName method, of class TopDriverDTO.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        TopDriverDTO instance = new TopDriverDTO();
        instance.setName(name);

    }

    /**
     * Test of getEmail method, of class TopDriverDTO.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        TopDriverDTO instance = new TopDriverDTO();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);

    }

    /**
     * Test of setEmail method, of class TopDriverDTO.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        TopDriverDTO instance = new TopDriverDTO();
        instance.setEmail(email);

    }

    /**
     * Test of getTotalRideDurationInSeconds method, of class TopDriverDTO.
     */
    @Test
    public void testGetTotalRideDurationInSeconds() {
        System.out.println("getTotalRideDurationInSeconds");
        TopDriverDTO instance = new TopDriverDTO();
        Long expResult = null;
        Long result = instance.getTotalRideDurationInSeconds();
        assertEquals(expResult, result);

    }

    /**
     * Test of setTotalRideDurationInSeconds method, of class TopDriverDTO.
     */
    @Test
    public void testSetTotalRideDurationInSeconds() {
        System.out.println("setTotalRideDurationInSeconds");
        Long totalRideDurationInSeconds = null;
        TopDriverDTO instance = new TopDriverDTO();
        instance.setTotalRideDurationInSeconds(totalRideDurationInSeconds);

    }

    /**
     * Test of getMaxRideDurationInSecods method, of class TopDriverDTO.
     */
    @Test
    public void testGetMaxRideDurationInSecods() {
        System.out.println("getMaxRideDurationInSecods");
        TopDriverDTO instance = new TopDriverDTO();
        Long expResult = null;
        Long result = instance.getMaxRideDurationInSecods();
        assertEquals(expResult, result);
      
    }

    /**
     * Test of setMaxRideDurationInSecods method, of class TopDriverDTO.
     */
    @Test
    public void testSetMaxRideDurationInSecods() {
        System.out.println("setMaxRideDurationInSecods");
        Long maxRideDurationInSecods = null;
        TopDriverDTO instance = new TopDriverDTO();
        instance.setMaxRideDurationInSecods(maxRideDurationInSecods);
 
    }

    /**
     * Test of getAverageDistance method, of class TopDriverDTO.
     */
    @Test
    public void testGetAverageDistance() {
        System.out.println("getAverageDistance");
        TopDriverDTO instance = new TopDriverDTO();
        Double expResult = null;
        Double result = instance.getAverageDistance();
        assertEquals(expResult, result);
     
    }

    /**
     * Test of setAverageDistance method, of class TopDriverDTO.
     */
    @Test
    public void testSetAverageDistance() {
        System.out.println("setAverageDistance");
        Double averageDistance = null;
        TopDriverDTO instance = new TopDriverDTO();
        instance.setAverageDistance(averageDistance);
        
    }
    
}
