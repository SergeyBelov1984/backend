package ru.sergeybelov.mebel.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeskEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "size_ id", referencedColumnName = "id")
    private DeskSizeEntity size;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "color_id", referencedColumnName = "id")
    private DeskColorEntity color;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "warehouse_id", referencedColumnName = "id")
    private WarehouseEntity warehouse;


}
