package rs.phonebook.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rs.phonebook.model.Phonebook;
import rs.phonebook.repository.PhonebookRepository;

@Service
public class PhonebookServiceImpl implements PhonebookService {

	@Autowired
	private PhonebookRepository phonebookRepository;

	@Override
	public void addPhoneContact(Phonebook contact) {
		phonebookRepository.save(contact);
	}

	@Override
	public List<Phonebook> getAll() {
		return (List<Phonebook>) phonebookRepository.findAll();
	}

}
