/**
 * 
 */
package main.java.com.crossover.techtrial.repositories;

import java.util.Optional;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import main.java.com.crossover.techtrial.model.Person;

/**
 * Person repository for basic operations on Person entity.
 * @author crossover
 */
@RestResource(exported=false)
public interface PersonRepository extends PagingAndSortingRepository<Person, Long> {
  Optional<Person> findById(Long id);

    public Person save(Person p);

    public Object findAll();
}
