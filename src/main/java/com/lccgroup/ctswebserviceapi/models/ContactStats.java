package com.lccgroup.ctswebserviceapi.models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

/**
 * POJO : ContactStatus
 */
@Entity
public class ContactStats {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name= "contact_status")
    private String contactStatus;

    @OneToMany(mappedBy = "contactStats")
    private List<MasterFilePerBucket> masterfileperbucket;


    // blank contructor
    public ContactStats(){}

    // constructor
    public ContactStats(Long id, String contactStatus){
        this.contactStatus = contactStatus;
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
     * @return String return the contactStatus
     */
    public String getContactStatus() {
        return contactStatus;
    }

    /**
     * @param contactStatus the contactStatus to set
     */
    public void setContactStatus(String contactStatus) {
        this.contactStatus = contactStatus;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((contactStatus == null) ? 0 : contactStatus.hashCode());
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
        ContactStats other = (ContactStats) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (contactStatus == null) {
            if (other.contactStatus != null)
                return false;
        } else if (!contactStatus.equals(other.contactStatus))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "ContactStats [id=" + id + ", contactStatus=" + contactStatus + "]";
    }
}
