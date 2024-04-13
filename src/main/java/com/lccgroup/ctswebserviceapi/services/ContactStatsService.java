package com.lccgroup.ctswebserviceapi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.lccgroup.ctswebserviceapi.models.ContactStats;
import com.lccgroup.ctswebserviceapi.repositories.ContactStatsRepository;


/**
 * SERVICE : ContactStatsService
 */
@Service
public class ContactStatsService {
    @Autowired
    private ContactStatsRepository contactStatsRepository;

    // select all
    public List<ContactStats> getAllContactStatsList(){
        return contactStatsRepository.findAll();
    }

    // create 
    public ContactStats create(ContactStats contactStats){
        return contactStatsRepository.save(contactStats);
    }

    // select by id
    public ContactStats get(Long id){
        Optional<ContactStats> optionalContactStats = contactStatsRepository.findById(id);
        if(optionalContactStats.isEmpty()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"ContactStats not found.");
        }
        return optionalContactStats.get();
    }

    // update
    public ContactStats update(Long id, ContactStats contactStats){
        Optional<ContactStats> optionalContactStats = contactStatsRepository.findById(id);
        if(optionalContactStats.isEmpty()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"ContactStats not found.");
        }
        ContactStats existingContactStats = optionalContactStats.get();
        existingContactStats.setContactStatus(contactStats.getContactStatus());
        return contactStatsRepository.save(existingContactStats);
    }

    // delete
    public void delete(Long id){
        contactStatsRepository.deleteById(id);
    }
}
