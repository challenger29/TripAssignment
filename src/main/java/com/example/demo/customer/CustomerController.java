package com.example.demo.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping("/customers")
    public List<Customer> getAllCustomers(){
        return customerService.getAllCustomer();
    }

    @RequestMapping(method = RequestMethod.POST ,value ="/customer")
    public void addCustomer(@RequestBody Customer customer){
        customerService.addCustomer(customer);
    }

    @RequestMapping(method = RequestMethod.DELETE , value = "/customer/{id}")
    public void deleteCustomer(@PathVariable("id") Long id){
        customerService.removeCustomer(id);
    }

}
