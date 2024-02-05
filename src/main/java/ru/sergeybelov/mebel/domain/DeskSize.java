package ru.sergeybelov.mebel.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DeskSize {

    private Integer id;
    private Integer lenght;
    private Integer width;
    private Integer height;
}
