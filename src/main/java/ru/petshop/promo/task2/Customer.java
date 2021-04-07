package ru.petshop.promo.task2;

import lombok.Data;

@Data
public class Customer {

    private String firstName;

    private String lastName;

    private String city;

    private String phone;

    public static Customer of(String firstName, String lastName, String city, String phone) {
        final var customer = new Customer();
        customer.setFirstName(firstName);
        customer.setLastName(lastName);
        customer.setCity(city);
        customer.setPhone(phone);
        return customer;
    }
}
