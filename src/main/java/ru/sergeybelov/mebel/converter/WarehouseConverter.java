package ru.sergeybelov.mebel.converter;

import ru.sergeybelov.mebel.domain.Warehouse;
import ru.sergeybelov.mebel.entity.WarehouseEntity;

import java.util.List;

public class WarehouseConverter {

    public static Warehouse toWarehouse(WarehouseEntity warehouseEntity) {
        return Warehouse.builder()
                .id(warehouseEntity.getId())
                .name(warehouseEntity.getName())
                .address(AddressConverter.toAddress(warehouseEntity.getAddress()))
                .build();
    }

    public static WarehouseEntity toWarehouseEntity(Warehouse warehouse) {
        return WarehouseEntity.builder()
                .id(warehouse.getId())
                .name(warehouse.getName())
                .address(AddressConverter.toAddressEntity(warehouse.getAddress()))
                .build();
    }

    public static List<Warehouse> toListWarehouses(List<WarehouseEntity> listWarehouseEntities) {
        return listWarehouseEntities
                .stream()
                .map(WarehouseConverter::toWarehouse)
                .toList();
    }

    public static List<WarehouseEntity> toListWarehouseEntities(List<Warehouse> listWarehouse) {
        return listWarehouse
                .stream()
                .map(WarehouseConverter::toWarehouseEntity)
                .toList();
    }
}
