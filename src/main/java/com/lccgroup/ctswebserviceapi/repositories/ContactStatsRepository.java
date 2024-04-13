package com.lccgroup.ctswebserviceapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lccgroup.ctswebserviceapi.models.ContactStats;

@Repository
public interface ContactStatsRepository extends JpaRepository<ContactStats, Long>{

}
