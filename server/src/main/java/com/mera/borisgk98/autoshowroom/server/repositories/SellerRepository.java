package com.mera.borisgk98.autoshowroom.server.repositories;

import com.mera.borisgk98.autoshowroom.server.models.Seller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SellerRepository extends JpaRepository<Seller, Integer> {
}
