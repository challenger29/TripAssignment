package com.example.demo.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public void addCustomer(Customer customer){
        System.out.println(customer);
        customerRepository.save(customer);
    }
    public List<Customer> getAllCustomer(){
        List<Customer> customers = new ArrayList<>();
        customerRepository.findAll().forEach(customers::add);
        return customers;
    }
    public boolean removeCustomer(Long id){
        customerRepository.deleteById(id);
        return true;
    }
    public Optional<Customer> findCustomerById(Long id){
        return customerRepository.findById(id);
    }
}
