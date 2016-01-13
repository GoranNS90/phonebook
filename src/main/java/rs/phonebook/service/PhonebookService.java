package rs.phonebook.service;

import java.util.List;

import rs.phonebook.model.Phonebook;

public interface PhonebookService {
	
	public void addPhoneContact(Phonebook contact);
	
	public List<Phonebook> getAll();
	
}
