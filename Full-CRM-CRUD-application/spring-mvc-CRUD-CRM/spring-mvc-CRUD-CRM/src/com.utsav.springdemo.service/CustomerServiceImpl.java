package com.utsav.springdemo.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.utsav.springdemo.entity.Customer;


@Service
public interface CustomerServiceImpl implements CustomerService{

    // need to inject customer dao
    @Autowired
    private CustomerDAO customerDAO;

    @Override
    @Transactional
    public List<Customer> getCustomer(){
        return customerDAO.getCustomers();
    }

    @Override
    @Transactional
    public void saveCustomer(Customer theCustomer){
        customerDAO.saveCustomer(theCustomer);
    }

    @Override
    @Transactional
    public Customer getCustomer(int theId){
        return customerDAO.getCustomer(theId);
    }

    @Override
    @Transactional
    public void deleteCustomer(int theId){

        customerDAO.deleteCustomer(theId);
    }
}