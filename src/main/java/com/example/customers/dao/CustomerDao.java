package com.example.customers.dao;

import com.example.customers.models.Customers;

import java.util.List;

public interface CustomerDao {

    List<Customers> getCustomers();

    Customers getCustomer(long document);

    Customers createCustomer(Customers customers);

    Customers updateCustomer(long document,Customers customers);

    Customers deleteCustomer(long document);
}
