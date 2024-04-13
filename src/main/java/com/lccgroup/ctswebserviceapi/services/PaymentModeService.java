package com.lccgroup.ctswebserviceapi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.lccgroup.ctswebserviceapi.models.PaymentMode;
import com.lccgroup.ctswebserviceapi.repositories.PaymentModeRepository;

@Service
public class PaymentModeService {

    @Autowired
    PaymentModeRepository paymentModeRepository;


    // select all
    public List<PaymentMode> getAllPaymentModeList(){
        return paymentModeRepository.findAll();
    }
    
    // create
    public PaymentMode create(PaymentMode paymentMode){
        return paymentModeRepository.save(paymentMode);
    }

    // select by id
    public PaymentMode get(Long id){
        Optional<PaymentMode> paymentModeOptional = paymentModeRepository.findById(id);
        if(paymentModeOptional.isEmpty()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"PaymentMode not found.");
        }
        return paymentModeOptional.get();
    }

    // update
    public PaymentMode update(Long id, PaymentMode paymentMode){
        Optional<PaymentMode> paymentModeOptional = paymentModeRepository.findById(id);
        if(paymentModeOptional.isEmpty()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"PaymentMode not found.");
        }
        PaymentMode paymentModeExisting = paymentModeOptional.get();
        paymentModeExisting.setPaymentMode(paymentMode.getPaymentMode());
        return paymentModeRepository.save(paymentModeExisting);
    }

    // delete
    public void delete(Long id){
        paymentModeRepository.deleteById(id);
    }
}
