package com.lccgroup.ctswebserviceapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lccgroup.ctswebserviceapi.models.PaymentMode;

@Repository
public interface PaymentModeRepository extends JpaRepository<PaymentMode, Long>{

}
