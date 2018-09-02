/**
 * 
 */
package main.java.com.crossover.techtrial.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "ride")
public class Ride implements Serializable{

  private static final long serialVersionUID = 9097639215351514001L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long id;

  @NotNull
  @Column(name = "start_time")
  String startTime;
  
  @NotNull
  @Column(name = "end_time")
  String endTime;
  
  @Column(name = "distance")
  Long distance;
  
  @ManyToOne
  @JoinColumn(name = "driver_id", referencedColumnName = "id")
  Person driver;
  
  @ManyToOne
  @JoinColumn(name = "rider_id", referencedColumnName = "id")
  Person rider;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  public Long getDistance() {
    return distance;
  }

  public void setDistance(Long distance) {
    this.distance = distance;
  }

  public Person getDriver() {
    return driver;
  }

  public void setDriver(Person driver) {
    this.driver = driver;
  }

  public Person getRider() {
    return rider;
  }

  public void setRider(Person rider) {
    this.rider = rider;
  }
  
  

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((distance == null) ? 0 : distance.hashCode());
    result = prime * result + ((driver == null) ? 0 : driver.hashCode());
    result = prime * result + ((endTime == null) ? 0 : endTime.hashCode());
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    result = prime * result + ((rider == null) ? 0 : rider.hashCode());
    result = prime * result + ((startTime == null) ? 0 : startTime.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Ride other = (Ride) obj;
    if (distance == null) {
      if (other.distance != null)
        return false;
    } else if (!distance.equals(other.distance))
      return false;
    if (driver == null) {
      if (other.driver != null)
        return false;
    } else if (!driver.equals(other.driver))
      return false;
    if (endTime == null) {
      if (other.endTime != null)
        return false;
    } else if (!endTime.equals(other.endTime))
      return false;
    if (id == null) {
      if (other.id != null)
        return false;
    } else if (!id.equals(other.id))
      return false;
    if (rider == null) {
      if (other.rider != null)
        return false;
    } else if (!rider.equals(other.rider))
      return false;
    if (startTime == null) {
      if (other.startTime != null)
        return false;
    } else if (!startTime.equals(other.startTime))
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "Ride [id=" + id + ", startTime=" + startTime + ", endTime=" + endTime + ", distance=" + distance + ", driver=" + driver + ", rider=" + rider + "]";
  }
  
  
  
}
