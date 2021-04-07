package ru.petshop.promo.task2;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    private List<Customer> list = new ArrayList<>();

    public CustomerServiceImpl() {
        list.add(Customer.of("Vasya", "Petrov", "MSK", "+7(999)1234567"));
        list.add(Customer.of("Sasha", "Ivanov", "SPB", "+7(888)7654321"));
    }

    @Override
    public List<Customer> findAll() {
        return list;
    }

    @Override
    public void create(Customer customer) {
        list.add(customer);
    }
}
