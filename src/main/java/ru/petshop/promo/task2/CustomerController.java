package ru.petshop.promo.task2;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping("/customer/list")
    public ResponseEntity<List<Customer>> list() {
        final var list = customerService.findAll();
        return ResponseEntity.ok(list);
    }

}
