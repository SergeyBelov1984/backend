package ru.sergeybelov.mebel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sergeybelov.mebel.entity.DeskColorEntity;

public interface DeskColorRepository extends JpaRepository <DeskColorEntity, Long> {
}
