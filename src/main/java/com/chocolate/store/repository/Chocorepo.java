package com.chocolate.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chocolate.store.entity.Chocolate;

public interface Chocorepo extends JpaRepository<Chocolate, Integer> {

}
