package ru.sergeybelov.mebel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sergeybelov.mebel.entity.AddressEntity;

public interface AddressRepository extends JpaRepository <AddressEntity, Long> {
}
