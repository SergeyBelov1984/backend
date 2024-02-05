package ru.sergeybelov.mebel.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sergeybelov.mebel.domain.Warehouse;
import ru.sergeybelov.mebel.service.WarehouseService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/warehouses")
public class WarehouseController {

    private final WarehouseService service;

    @GetMapping
    public List<Warehouse> get(){
        return service.getWarehouses();
    }
    @GetMapping ("/{id}")
    public Warehouse getById(@PathVariable Long id){
        return service.getWarehouseByID(id);
    }

}
