/**
 * 
 */
package main.java.com.crossover.techtrial.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import main.java.com.crossover.techtrial.model.Person;
import main.java.com.crossover.techtrial.repositories.PersonRepository;

/**
 * @author crossover
 *
 */
@Service
public class PersonServiceImpl implements PersonService{

  @Autowired
  PersonRepository personRepository;
  
  /* (non-Javadoc)
   * @see com.crossover.techtrial.service.PersonService#getAll()
   */
  @Override
  public List<Person> getAll() {
    List<Person> personList = new ArrayList<>();
    personRepository.findAll();
    return personList;
    
  }
  
  public Person save(Person p) {
    return personRepository.save(p);
  }

  @Override
  public Person findById(Long personId) {
    Optional<Person> dbPerson = personRepository.findById(personId);
    return dbPerson.orElse(null);
  }
  


}
