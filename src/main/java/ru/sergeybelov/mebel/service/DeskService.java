package ru.sergeybelov.mebel.service;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import ru.sergeybelov.mebel.converter.DeskConverter;
import ru.sergeybelov.mebel.converter.DeskSizeConverter;
import ru.sergeybelov.mebel.domain.Desk;
import ru.sergeybelov.mebel.entity.DeskEntity;
import ru.sergeybelov.mebel.repository.DeskRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DeskService {

    private final DeskRepository repository;

    public List<Desk> getDesks() {
        return DeskConverter.toListDesks(repository.findAll());
    }

    public Desk addDesk(Desk desk) {
        if (repository.findById(desk.getId()).isPresent())
        {
            throw new ResponseStatusException(HttpStatusCode.valueOf(409));
        }
        return DeskConverter.toDesk(repository.save(DeskConverter.toDeskEntity(desk)));
    }
    public Desk readDeskByID(Integer id) {
        return repository.findById(id).map(DeskConverter::toDesk).orElse(null);
    }

    public void deleteDeskByID(Integer id) {
        repository.deleteById(id);
    }

    public void deleteDesk(Desk desk) {
        repository.delete(DeskConverter.toDeskEntity(desk));
    }

    public Desk updateDesk(Desk desk) {

        Optional<DeskEntity> updatedDesk = repository.findById(desk.getId());
        updatedDesk.ifPresent(deskEntity -> {
            deskEntity.setName(desk.getName());
            deskEntity.setSize(DeskSizeConverter.toDeskSizeEntity(desk.getSize()));
            repository.save(deskEntity);
        });
        return updatedDesk.map(DeskConverter::toDesk).orElse(null);

    }
}
