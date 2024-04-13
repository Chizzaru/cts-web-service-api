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

import com.lccgroup.ctswebserviceapi.models.MasterFilePerBucket;
import com.lccgroup.ctswebserviceapi.services.MasterFilePerBucketService;

@RestController
@RequestMapping("masterfileperbucket")
public class MasterFilePerBucketController {

    @Autowired
    MasterFilePerBucketService masterFilePerBucketService;

    // select all
    @GetMapping(value = "/", produces = "application/json")
    public List<MasterFilePerBucket> getMasterFilePerBucketList(){
        return masterFilePerBucketService.getMasterFilePerBucketList();
    }

    // create
    @PostMapping(value = "/new", consumes = "application/json", produces = "application/json")
    public MasterFilePerBucket create(@RequestBody MasterFilePerBucket masterFilePerBucket){
        return masterFilePerBucketService.create(masterFilePerBucket);
    }

    // select by id
    @GetMapping(value = "/{id}", produces = "application/json")
    public MasterFilePerBucket get(@PathVariable Long id){
        return masterFilePerBucketService.get(id);
    }

    // update
    @PutMapping(value = "/{id}", consumes = "application/json", produces = "application/json")
    public MasterFilePerBucket update(@PathVariable Long id, @RequestBody MasterFilePerBucket masterFilePerBucket){
        return masterFilePerBucketService.update(id, masterFilePerBucket);
    }

    // delete
    @DeleteMapping(value = "/{id}", produces = "application/json")
    public void delete(@PathVariable Long id){
        masterFilePerBucketService.delete(id);
    }
}
