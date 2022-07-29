package com.example.customers.controllers;

import com.example.customers.dao.CustomerDao;
import com.example.customers.models.Customers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    private CustomerDao customerDao;

    @RequestMapping(value = "test")
    public String test(){
        return "Hola spring boot";
    }

    @RequestMapping(value="api/customers",method = RequestMethod.GET)
    public List<Customers> getCustomers(){

        return  customerDao.getCustomers();
    }
    @RequestMapping(value="api/customer/{document}",method = RequestMethod.GET)
    public Customers getCustomer(@PathVariable("document") long document){

        return  customerDao.getCustomer(document);
    }
    @RequestMapping(value="api/customer",method = RequestMethod.POST)
    public Customers insertCustomer(@RequestBody Customers customers){

        return  customerDao.createCustomer(customers);
    }
    @RequestMapping(value="api/customer/{document}",method = RequestMethod.PUT)
    public Customers updateCustomer(@PathVariable("document") long document,@RequestBody Customers customers){

        return  customerDao.updateCustomer(document,customers);
    }
    @RequestMapping(value="api/customer/{document}",method = RequestMethod.DELETE)
    public Customers deleteCustomer(@PathVariable("document") long document){

        return  customerDao.deleteCustomer(document);
    }


}
