package com.lccgroup.ctswebserviceapi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.lccgroup.ctswebserviceapi.models.MasterFilePerBucket;
import com.lccgroup.ctswebserviceapi.repositories.MasterFilePerBucketRepository;

@Service
public class MasterFilePerBucketService {

    @Autowired
    MasterFilePerBucketRepository masterFilePerBucketRepository;

    // select all
    public List<MasterFilePerBucket> getMasterFilePerBucketList(){
        return masterFilePerBucketRepository.findAll();
    }

    // create
    public MasterFilePerBucket create(MasterFilePerBucket masterFilePerBucket){
        return masterFilePerBucketRepository.save(masterFilePerBucket);
    }

    // select by id
    public MasterFilePerBucket get(Long id){
        Optional<MasterFilePerBucket> masterFilePerBucketOptional = masterFilePerBucketRepository.findById(id);
        if(masterFilePerBucketOptional.isEmpty()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"MasterFilePerBucket not found.");
        }
        return masterFilePerBucketOptional.get();
    }

    // update
    public MasterFilePerBucket update(Long id, MasterFilePerBucket masterFilePerBucket){
        Optional<MasterFilePerBucket> masterFilePerBucketOptional = masterFilePerBucketRepository.findById(id);
        if(masterFilePerBucketOptional.isEmpty()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"MasterFilePerBucket not found.");
        }

        MasterFilePerBucket masterFilePerBucketExisting = masterFilePerBucketOptional.get();
        
        masterFilePerBucketExisting.setCardType(masterFilePerBucket.getCardType());
        masterFilePerBucketExisting.setCardNumber(masterFilePerBucket.getCardNumber());
        masterFilePerBucketExisting.setCardName(masterFilePerBucket.getCardName());
        masterFilePerBucketExisting.setContact(masterFilePerBucket.getContact());
        masterFilePerBucketExisting.setBillDate(masterFilePerBucket.getBillDate());
        masterFilePerBucketExisting.setPrincipal(masterFilePerBucket.getPrincipal());
        masterFilePerBucketExisting.setInterest(masterFilePerBucket.getInterest());
        masterFilePerBucketExisting.setSurcharge(masterFilePerBucket.getSurcharge());
        masterFilePerBucketExisting.setTotal(masterFilePerBucket.getTotal());
        masterFilePerBucketExisting.setCaller(masterFilePerBucket.getCaller());
        masterFilePerBucketExisting.setDateCalled(masterFilePerBucket.getDateCalled());
        masterFilePerBucketExisting.setContactStats(masterFilePerBucket.getContactStats());
        masterFilePerBucketExisting.setPaymentMode(masterFilePerBucket.getPaymentMode());
        masterFilePerBucketExisting.setAmountToPay(masterFilePerBucket.getAmountToPay());
        masterFilePerBucketExisting.setDueDate(masterFilePerBucket.getDueDate());
        masterFilePerBucketExisting.setPaymentDate(masterFilePerBucket.getPaymentDate());
        masterFilePerBucketExisting.setRemarks(masterFilePerBucket.getRemarks());

        return masterFilePerBucketRepository.save(masterFilePerBucketExisting);
    }

    // delete
    public void delete(Long id){
        masterFilePerBucketRepository.deleteById(id);
    }
}
