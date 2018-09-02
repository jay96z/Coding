/**
 * 
 */
package main.java.com.crossover.techtrial.service;

import java.util.List;
import main.java.com.crossover.techtrial.model.Person;

/**
 * PersonService interface for Persons.
 * @author cossover
 *
 */
public interface PersonService {
  public List<Person> getAll();
  
  public Person save(Person p);
  
  public Person findById(Long personId);
  
}
