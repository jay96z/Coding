/**
 * 
 */
package main.java.com.crossover.techtrial.repositories;

import java.util.Optional;
import main.java.com.crossover.techtrial.model.Ride;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

/**
 * @author crossover
 *
 */
@RestResource(exported = false)
public interface RideRepository extends CrudRepository<Ride, Long> {

    public Optional<Ride> findById(Long rideId);

    public Ride save(Ride ride);

}
