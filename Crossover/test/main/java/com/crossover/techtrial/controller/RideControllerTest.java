/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main.java.com.crossover.techtrial.controller;

import java.time.LocalDateTime;
import java.util.List;
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
public class RideControllerTest {
    
    public RideControllerTest() {
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
     * Test of createNewRide method, of class RideController.
     */
    @Test
    public void testCreateNewRide() {
        System.out.println("createNewRide");
        Ride ride = null;
        RideController instance = new RideController();
        ResponseEntity expResult = null;
        ResponseEntity result = instance.createNewRide(ride);
        assertEquals(expResult, result);
      
    }

    /**
     * Test of getRideById method, of class RideController.
     */
    @Test
    public void testGetRideById() {
        System.out.println("getRideById");
        Long rideId = null;
        RideController instance = new RideController();
        ResponseEntity expResult = null;
        ResponseEntity result = instance.getRideById((rideId);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getTopDriver method, of class RideController.
     */
    @Test
    public void testGetTopDriver() {
        System.out.println("getTopDriver");
        Long count = null;
        LocalDateTime startTime = null;
        LocalDateTime endTime = null;
        RideController instance = new RideController();
        ResponseEntity<List<TopDriverDTO>> expResult = null;
        ResponseEntity<List<TopDriverDTO>> result = instance.getTopDriver(count, startTime, endTime);
        assertEquals(expResult, result);
        
    }
    
}
