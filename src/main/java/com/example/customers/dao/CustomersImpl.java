package com.example.customers.dao;

import com.example.customers.models.Customers;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class CustomersImpl implements CustomerDao{
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Customers> getCustomers(){
        String query="FROM Customers";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public Customers getCustomer(long document) {
        return entityManager.find(Customers.class,document);
    }


    @Override
    public Customers createCustomer(Customers customers) {
        return entityManager.merge(customers);
    }

    @Override
    public Customers updateCustomer(long document, Customers customers) {
        Customers c=new Customers();
        c=entityManager.find(Customers.class,document);
        c.setName(customers.getName());
        c.setLastName(customers.getLastName());
        c.setCellPhone(customers.getCellPhone());
        c.setEmail(customers.getEmail());
        c.setMunicipality(customers.getMunicipality());
        c.setAddress(customers.getAddress());
        c.setContactName(customers.getContactName());
        c.setCellPhoneContact(customers.getCellPhoneContact());
        return entityManager.merge(c);
    }

    @Override
    public Customers deleteCustomer(long document) {
        Customers c=entityManager.find(Customers.class,document);
        entityManager.remove(c);
        return c;
    }


}
