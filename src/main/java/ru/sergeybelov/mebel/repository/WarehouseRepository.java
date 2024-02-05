package ru.sergeybelov.mebel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sergeybelov.mebel.entity.WarehouseEntity;

public interface WarehouseRepository extends JpaRepository <WarehouseEntity, Long>{
}
