package ru.sergeybelov.mebel.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.sergeybelov.mebel.domain.Address;
import ru.sergeybelov.mebel.service.AddressService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/addresses")
public class AddressController {
    private final AddressService service;
    @GetMapping
    public List<Address> getAddress() {
        return service.getAddresses();
    }
    @PostMapping
    public Address addAddress(@RequestBody Address address) {
        return service.addAddress(address);
    }
}
