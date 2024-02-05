package ru.sergeybelov.mebel.converter;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.sergeybelov.mebel.domain.Desk;
import ru.sergeybelov.mebel.entity.DeskEntity;

import java.util.List;


public class DeskConverter {

    // инициализация через builder
    public static Desk toDesk(DeskEntity deskEntity) {
        return Desk.builder()
                .id(deskEntity.getId())
                .name(deskEntity.getName())
                .size(DeskSizeConverter.toDeskSize(deskEntity.getSize()))
                .color(DeskColorConverter.toDeskColor(deskEntity.getColor()))
                .warehouse(WarehouseConverter.toWarehouse(deskEntity.getWarehouse()))
                .build();
    }

    // инициализация через конструктор
    public static DeskEntity toDeskEntity(Desk desk) {
        return new DeskEntity(
                desk.getId(),
                desk.getName(),
                DeskSizeConverter.toDeskSizeEntity(desk.getSize()),
                DeskColorConverter.toDeskColorEntity(desk.getColor()),
                WarehouseConverter.toWarehouseEntity(desk.getWarehouse())
        );
    }

    public static List<Desk> toListDesks(List<DeskEntity> listDeskEntities) {
        return listDeskEntities
                .stream()
                .map(DeskConverter::toDesk)
                .toList();
    }

    public static List<DeskEntity> toListDeskEntities(List<Desk> listDesks) {
        return listDesks
                .stream()
                .map(DeskConverter::toDeskEntity)
                .toList();
    }
}
