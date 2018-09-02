/**
 * 
 */
package main.java.com.crossover.techtrial.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import main.java.com.crossover.techtrial.dto.TopDriverDTO;
import main.java.com.crossover.techtrial.model.Ride;
import main.java.com.crossover.techtrial.service.RideService;

/**
 * RideController for Ride related APIs.
 * @author crossover
 *
 */
@RestController
public class RideController {
  
  @Autowired
  RideService rideService;

  @PostMapping(path ="/api/ride")
  public ResponseEntity<Ride> createNewRide(@RequestBody Ride ride) {
    return ResponseEntity.ok(rideService.save(ride));
  }
  
  @GetMapping(path = "/api/ride/{ride-id}")
  public ResponseEntity<Ride> getRideById(@PathVariable(name="ride-id",required=true)Long rideId){
    Ride ride = rideService.findById(rideId);
    if (ride!=null)
      return ResponseEntity.ok(ride);
    return ResponseEntity.notFound().build();
  }
  
  /**
   * This API returns the top 5 drivers with their email,name, total minutes, maximum ride duration in minutes.
   * Only rides that starts and ends within the mentioned durations should be counted.
   * Any rides where either start or endtime is outside the search, should not be considered.
   * 
   * DONT CHANGE METHOD SIGNATURE AND RETURN TYPES
   * @return
   */
  @GetMapping(path = "/api/top-rides")
  public ResponseEntity<List<TopDriverDTO>> getTopDriver(
      @RequestParam(value="max", defaultValue="5") Long count,
      @RequestParam(value="startTime", required=true) @DateTimeFormat(pattern="yyyy-MM-dd'T'HH:mm:ss") LocalDateTime startTime,
      @RequestParam(value="endTime", required=true) @DateTimeFormat(pattern="yyyy-MM-dd'T'HH:mm:ss") LocalDateTime endTime){
    List<TopDriverDTO> topDrivers = new ArrayList<TopDriverDTO>();
    /**
     * Your Implementation Here. And Fill up topDrivers Arraylist with Top
     * 
     */
    
    return ResponseEntity.ok(topDrivers);
    
  }
  
}
