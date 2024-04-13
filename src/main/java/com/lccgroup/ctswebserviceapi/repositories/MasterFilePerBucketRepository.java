package com.lccgroup.ctswebserviceapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lccgroup.ctswebserviceapi.models.MasterFilePerBucket;

@Repository
public interface MasterFilePerBucketRepository extends JpaRepository<MasterFilePerBucket, Long>{

}
