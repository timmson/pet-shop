package ru.petshop.promo.task3;

import java.util.List;

/**
 * 3rd party service
 */
public interface CustomerService {

    List<Customer> findAll();

    void create(Customer customer);

}
