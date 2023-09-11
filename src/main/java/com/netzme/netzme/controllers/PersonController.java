package com.netzme.netzme.controllers;

import com.netzme.netzme.dtos.responses.PersonResponse;
import com.netzme.netzme.services.PersonService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/person")
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping
    public ResponseEntity<PersonResponse> getPerson() {

        PersonResponse pr = new PersonResponse();

        return ResponseEntity.ok(pr);
    }


}
