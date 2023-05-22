package com.utsav.springdemo.dao;

import java.util.List;
import com.utsav.springdemo.entity.Customer;

public  interface CustomerDAO {

    public List<Customer> getCustomer();
    public void saveCustomer(Customer theCustomer);
    public Customer getCustomer(int theId);

    public void deleteCustomer(int theId);
}