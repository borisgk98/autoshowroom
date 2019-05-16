package com.mera.borisgk98.autoshowroom.server.repositories;

import com.mera.borisgk98.autoshowroom.server.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
