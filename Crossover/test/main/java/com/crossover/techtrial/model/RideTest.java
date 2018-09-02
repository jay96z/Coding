/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.com.crossover.techtrial.model;

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
public class RideTest {
    
    public RideTest() {
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
     * Test of getId method, of class Ride.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Ride instance = new Ride();
        Long expResult = null;
        Long result = instance.getId();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setId method, of class Ride.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Long id = null;
        Ride instance = new Ride();
        instance.setId(id);
       
    }

    /**
     * Test of getStartTime method, of class Ride.
     */
    @Test
    public void testGetStartTime() {
        System.out.println("getStartTime");
        Ride instance = new Ride();
        String expResult = "";
        String result = instance.getStartTime();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setStartTime method, of class Ride.
     */
    @Test
    public void testSetStartTime() {
        System.out.println("setStartTime");
        String startTime = "";
        Ride instance = new Ride();
        instance.setStartTime(startTime);
        
    }

    /**
     * Test of getEndTime method, of class Ride.
     */
    @Test
    public void testGetEndTime() {
        System.out.println("getEndTime");
        Ride instance = new Ride();
        String expResult = "";
        String result = instance.getEndTime();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setEndTime method, of class Ride.
     */
    @Test
    public void testSetEndTime() {
        System.out.println("setEndTime");
        String endTime = "";
        Ride instance = new Ride();
        instance.setEndTime(endTime);
       
    }

    /**
     * Test of getDistance method, of class Ride.
     */
    @Test
    public void testGetDistance() {
        System.out.println("getDistance");
        Ride instance = new Ride();
        Long expResult = null;
        Long result = instance.getDistance();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setDistance method, of class Ride.
     */
    @Test
    public void testSetDistance() {
        System.out.println("setDistance");
        Long distance = null;
        Ride instance = new Ride();
        instance.setDistance(distance);
 
    }

    /**
     * Test of getDriver method, of class Ride.
     */
    @Test
    public void testGetDriver() {
        System.out.println("getDriver");
        Ride instance = new Ride();
        Person expResult = null;
        Person result = instance.getDriver();
        assertEquals(expResult, result);

    }

    /**
     * Test of setDriver method, of class Ride.
     */
    @Test
    public void testSetDriver() {
        System.out.println("setDriver");
        Person driver = null;
        Ride instance = new Ride();
        instance.setDriver(driver);

    }

    /**
     * Test of getRider method, of class Ride.
     */
    @Test
    public void testGetRider() {
        System.out.println("getRider");
        Ride instance = new Ride();
        Person expResult = null;
        Person result = instance.getRider();
        assertEquals(expResult, result);

    }

    /**
     * Test of setRider method, of class Ride.
     */
    @Test
    public void testSetRider() {
        System.out.println("setRider");
        Person rider = null;
        Ride instance = new Ride();
        instance.setRider(rider);

    }

    /**
     * Test of hashCode method, of class Ride.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Ride instance = new Ride();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);

    }

    /**
     * Test of equals method, of class Ride.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Ride instance = new Ride();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
   
    }

    /**
     * Test of toString method, of class Ride.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Ride instance = new Ride();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);

    }
    
}
