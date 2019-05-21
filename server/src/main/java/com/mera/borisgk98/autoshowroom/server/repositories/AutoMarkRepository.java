package com.mera.borisgk98.autoshowroom.server.repositories;

import com.mera.borisgk98.autoshowroom.server.models.AutoMark;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutoMarkRepository extends JpaRepository<AutoMark, Integer> {
}
