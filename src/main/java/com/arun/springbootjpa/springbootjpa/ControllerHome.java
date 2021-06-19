package com.arun.springbootjpa.springbootjpa;

import com.arun.springbootjpa.springbootjpa.Entity.Customer;
import com.arun.springbootjpa.springbootjpa.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class ControllerHome {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/RestAPI/v1/addCustomer")
        public void addCustomer(@RequestBody Customer customer){

        customerService.addCustomer(customer);

        }
    @GetMapping("/RestAPI/v1/getCustomer/{id}")
    public Optional<Customer> getCustomer(@PathVariable (name="id") String id){
        System.out.println(id);
        Optional<Customer> resp;
        if(id.equals("100")){
            throw new IllegalArgumentException();
        }else{
        resp=customerService.getCustomer(id);}
        return resp;
    }

}
