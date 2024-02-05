package ru.sergeybelov.mebel.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.sergeybelov.mebel.domain.Address;
import ru.sergeybelov.mebel.domain.Desk;
import ru.sergeybelov.mebel.service.DeskService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/desk")
public class DeskController {
    private final DeskService service;


    @GetMapping
    public List<Desk> getDesks() {
        return service.getDesks();
    }

    @GetMapping("/{id}")
    public Desk getDeskById(@PathVariable Integer id) {
        return service.readDeskByID(id);
    }

    @PostMapping
    public Desk addDesk(@RequestBody Desk desk) {
        return service.addDesk(desk);
    }

    @DeleteMapping("/desk/{id}")
    public void deleteDeskById(@PathVariable Integer id) {
        service.deleteDeskByID(id);
    }

    @PutMapping
    public Desk updateDesk(@RequestBody Desk desk) {
        return service.updateDesk(desk);
    }

}
