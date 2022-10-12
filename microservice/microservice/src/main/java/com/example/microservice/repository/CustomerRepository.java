package com.example.microservice.repository;

import com.example.microservice.model.Customer;
import com.example.microservice.request.NewCustomerRequest;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
