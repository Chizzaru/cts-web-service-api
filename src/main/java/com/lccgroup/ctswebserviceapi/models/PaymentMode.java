package com.lccgroup.ctswebserviceapi.models;



import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

/**
 * POJO : PaymentMode
 */
@Entity
public class PaymentMode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="payment_mode")
    private String paymentMode;


    @OneToMany(mappedBy = "paymentMode")
    private List<MasterFilePerBucket> masterfileperbucket;

    // blank constructor
    public PaymentMode(){}

    // constructor
    public PaymentMode(String paymentMode){
        this.paymentMode = paymentMode;
    }


    /**
     * @return Long return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return String return the paymentMode
     */
    public String getPaymentMode() {
        return paymentMode;
    }

    /**
     * @param paymentMode the paymentMode to set
     */
    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((paymentMode == null) ? 0 : paymentMode.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        PaymentMode other = (PaymentMode) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (paymentMode == null) {
            if (other.paymentMode != null)
                return false;
        } else if (!paymentMode.equals(other.paymentMode))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "PaymentMode [id=" + id + ", paymentMode=" + paymentMode + "]";
    }

}
