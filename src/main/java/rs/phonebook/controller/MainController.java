package rs.phonebook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import rs.phonebook.model.Phonebook;
import rs.phonebook.service.PhonebookService;

@RestController
public class MainController {

	@Autowired
	private PhonebookService phonebookService;

	@RequestMapping(value = "/getAll")
	public List<Phonebook> getAll() {
		return phonebookService.getAll();
	}

	@RequestMapping(value = "/saveContact", method = RequestMethod.POST)
	public void insertContant(@RequestBody Phonebook contact) {
		phonebookService.addPhoneContact(contact);
	}
}
