package com.lccgroup.ctswebserviceapi.models;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


/**
 * POJO : MasterFilePerBucket
 */
@Entity
public class MasterFilePerBucket {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;
    
    @Column(name = "card_type")
    private String cardType;

    @Column(name = "card_number")
    private String cardNumber;

    @Column(name = "card_name")
    private String cardName;

    @Column(name = "address")
    private String address;

    @Column(name = "contact")
    private String contact;

    @Column(name = "bill_date")
    private LocalDateTime billDate;

    @Column(name = "principal")
    private Double principal;

    @Column(name = "interest")
    private Double interest;

    @Column(name = "surcharge")
    private Double surcharge;

    @Column(name = "total")
    private Double total;

    @Column(name = "caller")
    private String caller;

    @Column(name = "date_called")
    private LocalDateTime dateCalled;

    @ManyToOne
    @JoinColumn(name="contact_stats_id")
    private ContactStats contactStats;

    @ManyToOne
    @JoinColumn(name="payment_mode_id")
    private PaymentMode paymentMode;

    @Column(name="amount_to_pay")
    private Double amountToPay;

    @Column(name="due_date")
    private LocalDateTime dueDate;

    @Column(name="payment_date")
    private LocalDateTime paymentDate;

    @Column(name="remarks")
    private String remarks;


    // blank constructor
    public MasterFilePerBucket(){}

    // constructor
    public MasterFilePerBucket(
        String cardType,
        String cardNumber,
        String cardName,
        String address,
        String contact,
        LocalDateTime billDate,
        Double principal,
        Double interest,
        Double surcharge,
        Double total,
        String caller,
        LocalDateTime dateCalled,
        ContactStats contactStats,
        PaymentMode paymentMode,
        Double amountToPay,
        LocalDateTime dueDate,
        LocalDateTime paymentDate,
        String remarks
    ){
        this.cardType = cardType;
        this.cardNumber = cardNumber;
        this.cardName = cardName;
        this.address = address;
        this.contact = contact;
        this.billDate = billDate;
        this.principal = principal;
        this.interest = interest;
        this.surcharge = surcharge;
        this.total = total;
        this.caller = caller;
        this.dateCalled = dateCalled;
        this.contactStats = contactStats;
        this.paymentMode = paymentMode;
        this.amountToPay = amountToPay;
        this.dueDate = dueDate;
        this.paymentDate = paymentDate;
        this.remarks = remarks;
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
     * @return String return the cardType
     */
    public String getCardType() {
        return cardType;
    }

    /**
     * @param cardType the cardType to set
     */
    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    /**
     * @return String return the cardNumber
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * @param cardNumber the cardNumber to set
     */
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    /**
     * @return String return the cardName
     */
    public String getCardName() {
        return cardName;
    }

    /**
     * @param cardName the cardName to set
     */
    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    /**
     * @return String return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return String return the contact
     */
    public String getContact() {
        return contact;
    }

    /**
     * @param contact the contact to set
     */
    public void setContact(String contact) {
        this.contact = contact;
    }

    /**
     * @return LocalDateTime return the billDate
     */
    public LocalDateTime getBillDate() {
        return billDate;
    }

    /**
     * @param billDate the billDate to set
     */
    public void setBillDate(LocalDateTime billDate) {
        this.billDate = billDate;
    }

    /**
     * @return Double return the principal
     */
    public Double getPrincipal() {
        return principal;
    }

    /**
     * @param principal the principal to set
     */
    public void setPrincipal(Double principal) {
        this.principal = principal;
    }

    /**
     * @return Double return the interest
     */
    public Double getInterest() {
        return interest;
    }

    /**
     * @param interest the interest to set
     */
    public void setInterest(Double interest) {
        this.interest = interest;
    }

    /**
     * @return Double return the surcharge
     */
    public Double getSurcharge() {
        return surcharge;
    }

    /**
     * @param surcharge the surcharge to set
     */
    public void setSurcharge(Double surcharge) {
        this.surcharge = surcharge;
    }

    /**
     * @return Double return the total
     */
    public Double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(Double total) {
        this.total = total;
    }

    /**
     * @return String return the caller
     */
    public String getCaller() {
        return caller;
    }

    /**
     * @param caller the caller to set
     */
    public void setCaller(String caller) {
        this.caller = caller;
    }

    /**
     * @return LocalDateTime return the dateCalled
     */
    public LocalDateTime getDateCalled() {
        return dateCalled;
    }

    /**
     * @param dateCalled the dateCalled to set
     */
    public void setDateCalled(LocalDateTime dateCalled) {
        this.dateCalled = dateCalled;
    }

    /**
     * @return ContactStats return the contactStats
     */
    public ContactStats getContactStats() {
        return contactStats;
    }

    /**
     * @param contactStats the contactStats to set
     */
    public void setContactStats(ContactStats contactStats) {
        this.contactStats = contactStats;
    }

    /**
     * @return PaymentMode return the paymentMode
     */
    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    /**
     * @param paymentMode the paymentMode to set
     */
    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }

    /**
     * @return Double return the amountToPay
     */
    public Double getAmountToPay() {
        return amountToPay;
    }

    /**
     * @param amountToPay the amountToPay to set
     */
    public void setAmountToPay(Double amountToPay) {
        this.amountToPay = amountToPay;
    }

    /**
     * @return LocalDateTime return the dueDate
     */
    public LocalDateTime getDueDate() {
        return dueDate;
    }

    /**
     * @param dueDate the dueDate to set
     */
    public void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }

    /**
     * @return LocalDateTime return the paymentDate
     */
    public LocalDateTime getPaymentDate() {
        return paymentDate;
    }

    /**
     * @param paymentDate the paymentDate to set
     */
    public void setPaymentDate(LocalDateTime paymentDate) {
        this.paymentDate = paymentDate;
    }

    /**
     * @return String return the remarks
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * @param remarks the remarks to set
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((cardType == null) ? 0 : cardType.hashCode());
        result = prime * result + ((cardNumber == null) ? 0 : cardNumber.hashCode());
        result = prime * result + ((cardName == null) ? 0 : cardName.hashCode());
        result = prime * result + ((address == null) ? 0 : address.hashCode());
        result = prime * result + ((contact == null) ? 0 : contact.hashCode());
        result = prime * result + ((billDate == null) ? 0 : billDate.hashCode());
        result = prime * result + ((principal == null) ? 0 : principal.hashCode());
        result = prime * result + ((interest == null) ? 0 : interest.hashCode());
        result = prime * result + ((surcharge == null) ? 0 : surcharge.hashCode());
        result = prime * result + ((total == null) ? 0 : total.hashCode());
        result = prime * result + ((caller == null) ? 0 : caller.hashCode());
        result = prime * result + ((dateCalled == null) ? 0 : dateCalled.hashCode());
        result = prime * result + ((contactStats == null) ? 0 : contactStats.hashCode());
        result = prime * result + ((paymentMode == null) ? 0 : paymentMode.hashCode());
        result = prime * result + ((amountToPay == null) ? 0 : amountToPay.hashCode());
        result = prime * result + ((dueDate == null) ? 0 : dueDate.hashCode());
        result = prime * result + ((paymentDate == null) ? 0 : paymentDate.hashCode());
        result = prime * result + ((remarks == null) ? 0 : remarks.hashCode());
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
        MasterFilePerBucket other = (MasterFilePerBucket) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (cardType == null) {
            if (other.cardType != null)
                return false;
        } else if (!cardType.equals(other.cardType))
            return false;
        if (cardNumber == null) {
            if (other.cardNumber != null)
                return false;
        } else if (!cardNumber.equals(other.cardNumber))
            return false;
        if (cardName == null) {
            if (other.cardName != null)
                return false;
        } else if (!cardName.equals(other.cardName))
            return false;
        if (address == null) {
            if (other.address != null)
                return false;
        } else if (!address.equals(other.address))
            return false;
        if (contact == null) {
            if (other.contact != null)
                return false;
        } else if (!contact.equals(other.contact))
            return false;
        if (billDate == null) {
            if (other.billDate != null)
                return false;
        } else if (!billDate.equals(other.billDate))
            return false;
        if (principal == null) {
            if (other.principal != null)
                return false;
        } else if (!principal.equals(other.principal))
            return false;
        if (interest == null) {
            if (other.interest != null)
                return false;
        } else if (!interest.equals(other.interest))
            return false;
        if (surcharge == null) {
            if (other.surcharge != null)
                return false;
        } else if (!surcharge.equals(other.surcharge))
            return false;
        if (total == null) {
            if (other.total != null)
                return false;
        } else if (!total.equals(other.total))
            return false;
        if (caller == null) {
            if (other.caller != null)
                return false;
        } else if (!caller.equals(other.caller))
            return false;
        if (dateCalled == null) {
            if (other.dateCalled != null)
                return false;
        } else if (!dateCalled.equals(other.dateCalled))
            return false;
        if (contactStats == null) {
            if (other.contactStats != null)
                return false;
        } else if (!contactStats.equals(other.contactStats))
            return false;
        if (paymentMode == null) {
            if (other.paymentMode != null)
                return false;
        } else if (!paymentMode.equals(other.paymentMode))
            return false;
        if (amountToPay == null) {
            if (other.amountToPay != null)
                return false;
        } else if (!amountToPay.equals(other.amountToPay))
            return false;
        if (dueDate == null) {
            if (other.dueDate != null)
                return false;
        } else if (!dueDate.equals(other.dueDate))
            return false;
        if (paymentDate == null) {
            if (other.paymentDate != null)
                return false;
        } else if (!paymentDate.equals(other.paymentDate))
            return false;
        if (remarks == null) {
            if (other.remarks != null)
                return false;
        } else if (!remarks.equals(other.remarks))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "MasterFilePerBucket [id=" + id + ", cardType=" + cardType + ", cardNumber=" + cardNumber + ", cardName="
                + cardName + ", address=" + address + ", contact=" + contact + ", billDate=" + billDate + ", principal="
                + principal + ", interest=" + interest + ", surcharge=" + surcharge + ", total=" + total + ", caller="
                + caller + ", dateCalled=" + dateCalled + ", contactStats=" + contactStats + ", paymentMode="
                + paymentMode + ", amountToPay=" + amountToPay + ", dueDate=" + dueDate + ", paymentDate=" + paymentDate
                + ", remarks=" + remarks + "]";
    }

}
