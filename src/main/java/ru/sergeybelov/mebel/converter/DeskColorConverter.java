package ru.sergeybelov.mebel.converter;

import ru.sergeybelov.mebel.domain.DeskColor;
import ru.sergeybelov.mebel.domain.DeskSize;
import ru.sergeybelov.mebel.entity.DeskColorEntity;
import ru.sergeybelov.mebel.entity.DeskSizeEntity;

import java.util.List;

public class DeskColorConverter {
    public static DeskColor toDeskColor(DeskColorEntity deskColorEntity) {
        return  DeskColor.builder()
                .id(deskColorEntity.getId())
                .name(deskColorEntity.getName())
                .hex(deskColorEntity.getHex())
                .build();
    }
    public static DeskColorEntity toDeskColorEntity(DeskColor deskColor) {
        return  DeskColorEntity.builder()
                .id(deskColor.getId())
                .name(deskColor.getName())
                .hex(deskColor.getHex())
                .build();
    }

    public static List<DeskColor> toListDeskColors(List<DeskColorEntity> listDeskColorEntities) {
        return listDeskColorEntities
                .stream()
                .map(DeskColorConverter::toDeskColor)
                .toList();
    }

    public static List<DeskColorEntity> toListDeskColorEntities(List<DeskColor> listDeskColors) {
        return listDeskColors
                .stream()
                .map(DeskColorConverter::toDeskColorEntity)
                .toList();
    }
}
