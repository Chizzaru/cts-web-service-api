
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

import com.lccgroup.ctswebserviceapi.models.PaymentMode;
import com.lccgroup.ctswebserviceapi.services.PaymentModeService;

@RestController
@RequestMapping("paymentmode")
public class PaymentModeController {

    @Autowired
    PaymentModeService paymentModeService;

    // get all
    @GetMapping(value = "/", produces = "application/json")
    public List<PaymentMode> getAllPaymentModeList(){
        return paymentModeService.getAllPaymentModeList();
    }

    // post
    @PostMapping(value = "/new",consumes = "application/json", produces = "application/json")
    public PaymentMode create(@RequestBody PaymentMode paymentMode){
        return paymentModeService.create(paymentMode);
    }

    // get by id
    @GetMapping(value = "/{id}", produces = "application/json")
    public PaymentMode get(@PathVariable Long id){
        return paymentModeService.get(id);
    }

    // put
    @PutMapping(value = "/{id}", consumes = "application/json", produces = "application/json")
    public PaymentMode update(@PathVariable Long id, @RequestBody PaymentMode paymentMode){
        return paymentModeService.update(id, paymentMode);
    }

    // delete
    @DeleteMapping(value = "/{id}", produces = "application/json")
    public void delete(@PathVariable Long id){
        paymentModeService.delete(id);
    }
}
