package com.arun.springbootjpa.springbootjpa.Service;

import com.arun.springbootjpa.springbootjpa.Dao.CustomerDao;
import com.arun.springbootjpa.springbootjpa.Entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerDao customerDao;
    public List<Customer> getAllCustomer()
    {
        List<Customer>customer = new ArrayList();
        customerDao.findAll().forEach(customer::add);
        return customer;
    }
    public void addCustomer(Customer customer)
    {
        customerDao.save(customer);
    }
    public Optional<Customer> getCustomer(String id){

        Optional<Customer> resp=customerDao.findById(id);

        return resp;
    }
}
