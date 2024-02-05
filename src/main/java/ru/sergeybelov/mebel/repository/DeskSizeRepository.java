package ru.sergeybelov.mebel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sergeybelov.mebel.entity.DeskSizeEntity;

public interface DeskSizeRepository extends JpaRepository<DeskSizeEntity, Integer> {
}
