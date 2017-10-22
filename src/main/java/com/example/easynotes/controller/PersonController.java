package com.example.easynotes.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.easynotes.model.Note;
import com.example.easynotes.model.Person;
import com.example.easynotes.repository.PersonRepo;

@RestController
public class PersonController {
	
	@Autowired
	PersonRepo personRepo;
	
	@PostMapping("/savePerson")
    public Person createPerson(@Valid @RequestBody Person person) {
    	return personRepo.save(person);
    }
	
	@GetMapping(value = "/getAllPerson")
    public List<Person> getUsersContact() {
		System.out.println(personRepo.count());
        return personRepo.findAll();
    }
	@PostMapping("/updatePerson")
    public Person updatePerson(@Valid @RequestBody Person person) {
    	return personRepo.save(person);
    }
	@GetMapping("/getPerson/{id}")
    public ResponseEntity<Person> getNoteById(@PathVariable(value = "id") Long noteId) {
		Person note = personRepo.findOne(noteId);
        if(note == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(note);
    }
}
