package ru.sergeybelov.mebel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sergeybelov.mebel.entity.DeskEntity;

public interface DeskRepository extends JpaRepository<DeskEntity, Integer> {
}
