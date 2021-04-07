package ru.petshop.promo.task3;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class CustomerController {

    private CustomerService customerService;

    @GetMapping("/customer/list")
    public ResponseEntity<List<Customer>> list() {
        final var list = customerService.findAll();
        return ResponseEntity.ok(list);
    }

    @PostMapping("/customer/create")
    public ResponseEntity<String> create(@RequestBody Customer customer) {
        customerService.create(customer);
        return ResponseEntity.ok("OK");
    }
}
