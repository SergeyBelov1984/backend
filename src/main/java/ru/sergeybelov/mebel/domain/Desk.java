package ru.sergeybelov.mebel.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Desk {

    private Integer id;
    private String name;
    private DeskSize size;
    private DeskColor color;
    private Warehouse warehouse;

}
