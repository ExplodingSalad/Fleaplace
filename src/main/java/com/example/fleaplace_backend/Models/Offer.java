package com.example.fleaplace_backend.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Offer {
    @Id
    @Column(name = "offerId", nullable = false)
    private Long offerId;

    @Column(name = "offerTitle")
    private String offerTitle;

    @Column(name = "offerDescription")
    private String offerDescription;

    @Column(name = "offerPrice")
    private Double offerPrice;

    @Column(name = "offerImagePath")
    private String offerImagePath;

    //TODO: field linking to user

    public Long getOfferId() {
        return offerId;
    }

    public void setOfferId(Long id) {
        this.offerId = id;
    }

    public String getOfferTitle() {
        return offerTitle;
    }

    public void setOfferTitle(String offerTitle) {
        this.offerTitle = offerTitle;
    }

    public String getOfferDescription() {
        return offerDescription;
    }

    public void setOfferDescription(String offerDescription) {
        this.offerDescription = offerDescription;
    }

    public Double getOfferPrice() {
        return offerPrice;
    }

    public void setOfferPrice(Double offerPrice) {
        this.offerPrice = offerPrice;
    }

    public String getOfferImagePath() {
        return offerImagePath;
    }

    public void setOfferImagePath(String offerImagePath) {
        this.offerImagePath = offerImagePath;
    }
}
