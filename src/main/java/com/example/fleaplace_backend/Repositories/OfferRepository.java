package com.example.fleaplace_backend.Repositories;

import com.example.fleaplace_backend.Models.Offer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OfferRepository extends JpaRepository<Offer, Long> {
}
