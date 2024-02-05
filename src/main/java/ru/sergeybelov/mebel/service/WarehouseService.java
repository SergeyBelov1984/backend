package ru.sergeybelov.mebel.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.sergeybelov.mebel.converter.DeskConverter;
import ru.sergeybelov.mebel.converter.WarehouseConverter;
import ru.sergeybelov.mebel.domain.Desk;
import ru.sergeybelov.mebel.domain.Warehouse;
import ru.sergeybelov.mebel.repository.WarehouseRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class WarehouseService {
    private final WarehouseRepository repository;

    public List<Warehouse> getWarehouses() {
        return WarehouseConverter.toListWarehouses(repository.findAll());
    }
    public Warehouse getWarehouseByID(Long id) {
        return repository.findById(id).map(WarehouseConverter::toWarehouse).orElse(null);
    }
}
