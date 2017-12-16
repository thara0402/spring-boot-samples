package com.example.helloworldjpa.repository;

import com.example.helloworldjpa.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}