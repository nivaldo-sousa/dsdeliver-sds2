package com.devsuperior.dsdelivere.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsdelivere.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
