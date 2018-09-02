/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.com.crossover.techtrial.service;

import main.java.com.crossover.techtrial.model.Ride;
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
public class RideServiceTest {
    
    public RideServiceTest() {
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
     * Test of save method, of class RideService.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        Ride ride = null;
        RideService instance = new RideServiceImpl();
        Ride expResult = null;
        Ride result = instance.save(ride);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findById method, of class RideService.
     */
    @Test
    public void testFindById() {
        System.out.println("findById");
        Long rideId = null;
        RideService instance = new RideServiceImpl();
        Ride expResult = null;
        Ride result = instance.findById(rideId);
        assertEquals(expResult, result);
 
    }

    public class RideServiceImpl implements RideService {

        public Ride save(Ride ride) {
            return null;
        }

        public Ride findById(Long rideId) {
            return null;
        }
    }
    
}
