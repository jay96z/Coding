/**
 * 
 */
package main.java.com.crossover.techtrial.service;

import main.java.com.crossover.techtrial.model.Ride;

/**
 * RideService for rides.
 * @author crossover
 *
 */
public interface RideService {
  
  public Ride save(Ride ride);
  
  public Ride findById(Long rideId);
  

}
