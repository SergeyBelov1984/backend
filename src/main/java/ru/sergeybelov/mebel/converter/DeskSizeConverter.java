package ru.sergeybelov.mebel.converter;

import ru.sergeybelov.mebel.domain.Desk;
import ru.sergeybelov.mebel.domain.DeskSize;
import ru.sergeybelov.mebel.entity.DeskEntity;
import ru.sergeybelov.mebel.entity.DeskSizeEntity;

import java.util.List;

public class DeskSizeConverter {

    public static DeskSize toDeskSize(DeskSizeEntity deskSizeEntity) {
        return  DeskSize.builder()
                .id(deskSizeEntity.getId())
                .lenght(deskSizeEntity.getLenght())
                .height(deskSizeEntity.getHeight())
                .width(deskSizeEntity.getWidth())
                .build();

    }
    public static DeskSizeEntity toDeskSizeEntity(DeskSize deskSize) {
        return  DeskSizeEntity.builder()
                .id(deskSize.getId())
                .lenght(deskSize.getLenght())
                .height(deskSize.getHeight())
                .width(deskSize.getWidth())
                .build();
    }
    public static List<DeskSize> toListDeskSizes(List<DeskSizeEntity> listDeskSizeEntities) {
        return listDeskSizeEntities
                .stream()
                .map(DeskSizeConverter::toDeskSize)
                .toList();
    }

    public static List<DeskSizeEntity> toListDeskSizeEntities(List<DeskSize> listDeskSizes) {
        return listDeskSizes
                .stream()
                .map(DeskSizeConverter::toDeskSizeEntity)
                .toList();
    }


}
