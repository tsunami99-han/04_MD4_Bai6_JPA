package com.codegym.service;

import com.codegym.model.Customer;
import com.codegym.repo.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CustomerService implements ICustomerService{
    @Autowired
    private ICustomerRepository customerRepository;
    @Override
    public List findAll() {
        List<Customer> customers= customerRepository.findAll();
        return customers;
    }

    @Override
    public Customer findById(Long id) {
        Customer customer= customerRepository.findById(id);
        return customer;
    }

    @Override
    public void save(Customer customer) {
    customerRepository.save(customer);
    }

    @Override
    public void remove(Long id) {
    customerRepository.remove(id);
    }
}
