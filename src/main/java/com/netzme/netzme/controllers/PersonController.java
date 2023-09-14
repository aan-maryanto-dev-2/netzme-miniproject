package com.netzme.netzme.controllers;

import com.netzme.netzme.dtos.responses.PersonResponse;
import com.netzme.netzme.services.PersonServiceImp;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/person")
@RequiredArgsConstructor
public class PersonController {

    private final PersonServiceImp personServiceImp;
    private final String url = "https://randomuser.me/api/";

    @GetMapping
    public ResponseEntity<PersonResponse> getPerson() {

        PersonResponse pr = new PersonResponse();
        personServiceImp.getPerson(url);

        return ResponseEntity.ok(pr);
    }


}
