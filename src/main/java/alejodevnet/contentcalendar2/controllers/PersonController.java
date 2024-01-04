package alejodevnet.contentcalendar2.controllers;

import alejodevnet.contentcalendar2.models.Person;
import alejodevnet.contentcalendar2.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/persons/")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping
    private ResponseEntity <List<Person>> getAllPersons(){
        return ResponseEntity.ok(personService.findAll());
    }
}