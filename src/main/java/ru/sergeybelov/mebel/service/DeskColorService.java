package ru.sergeybelov.mebel.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.sergeybelov.mebel.converter.DeskColorConverter;
import ru.sergeybelov.mebel.converter.DeskSizeConverter;
import ru.sergeybelov.mebel.domain.DeskColor;
import ru.sergeybelov.mebel.domain.DeskSize;
import ru.sergeybelov.mebel.repository.DeskColorRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DeskColorService {

    private DeskColorRepository colorRepository;

    public List<DeskColor> getDeskColors() { return DeskColorConverter.toListDeskColors(colorRepository.findAll());
    }
}
