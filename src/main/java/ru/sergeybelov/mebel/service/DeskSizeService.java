package ru.sergeybelov.mebel.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.sergeybelov.mebel.converter.DeskSizeConverter;
import ru.sergeybelov.mebel.domain.DeskSize;
import ru.sergeybelov.mebel.repository.DeskSizeRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DeskSizeService {
    private final DeskSizeRepository sizeRepository;

    public List<DeskSize> getDeskSizes() {
        return DeskSizeConverter.toListDeskSizes(sizeRepository.findAll());
    }


}
