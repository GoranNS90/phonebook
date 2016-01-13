package rs.phonebook.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import rs.phonebook.model.Phonebook;

@Repository
public interface PhonebookRepository extends CrudRepository<Phonebook, Integer>{

}
