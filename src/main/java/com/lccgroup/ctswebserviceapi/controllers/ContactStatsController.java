package com.lccgroup.ctswebserviceapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lccgroup.ctswebserviceapi.models.ContactStats;
import com.lccgroup.ctswebserviceapi.services.ContactStatsService;

@RestController
@RequestMapping("contactstats")
public class ContactStatsController {

    @Autowired
    ContactStatsService contactStatsService;

    // get request to view contactstats list
    @GetMapping(value = "/", produces = "application/json")
    public List<ContactStats> getAllContactStatsList(){
        return contactStatsService.getAllContactStatsList();
    }

    // post request for creating new contactstats
    @PostMapping(value = "/new", consumes = "application/json", produces = "application/json")
    public ContactStats create(@RequestBody ContactStats contactStats){
        return contactStatsService.create(contactStats);
    }

    // get request for selecting specific contactstats
    @GetMapping(value = "/{id}",produces = "application/json")
    public ContactStats get(@PathVariable Long id){
        return contactStatsService.get(id);
    }

    // put request for updating contactstats
    @PutMapping(value = "/{id}", consumes = "application/json", produces = "application/json")
    public ContactStats update(@PathVariable Long id, @RequestBody ContactStats contactStats){
        return contactStatsService.update(id, contactStats);
    }

    // delete
    @DeleteMapping(value = "/{id}", produces = "application//json")
    public void delete(@PathVariable Long id){
        contactStatsService.delete(id);
    }

}
