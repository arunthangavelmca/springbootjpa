package com.arun.springbootjpa.springbootjpa.Dao;

import com.arun.springbootjpa.springbootjpa.Entity.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerDao extends CrudRepository<Customer, String> {
}
