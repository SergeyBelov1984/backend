package ru.sergeybelov.mebel.service;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import ru.sergeybelov.mebel.converter.AddressConverter;
import ru.sergeybelov.mebel.domain.Address;
import ru.sergeybelov.mebel.repository.AddressRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AddressService {
    private final AddressRepository repository;

    public List<Address> getAddresses() {
        return AddressConverter.toListAddresses(repository.findAll());
    }

    public Address addAddress(Address address) {
        if (repository.findById(address.getId()).isPresent()) {
            throw new ResponseStatusException(HttpStatusCode.valueOf(409));
        }
        return AddressConverter.toAddress(repository.save(AddressConverter.toAddressEntity(address)));
    }
}
