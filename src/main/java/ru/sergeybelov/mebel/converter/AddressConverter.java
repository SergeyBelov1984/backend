package ru.sergeybelov.mebel.converter;

import ru.sergeybelov.mebel.domain.Address;
import ru.sergeybelov.mebel.domain.DeskSize;
import ru.sergeybelov.mebel.entity.AddressEntity;
import ru.sergeybelov.mebel.entity.DeskSizeEntity;

import java.util.List;

public class AddressConverter {

    public static Address toAddress(AddressEntity addressEntity) {
        return Address.builder()
                .id(addressEntity.getId())
                .city(addressEntity.getCity())
                .street(addressEntity.getStreet())
                .building(addressEntity.getBuilding())
                .apartment(addressEntity.getApartment())
                .build();
    }

    public static AddressEntity toAddressEntity(Address address) {
        return AddressEntity.builder()
                .id(address.getId())
                .city(address.getCity())
                .street(address.getStreet())
                .building(address.getBuilding())
                .apartment(address.getApartment())
                .build();
    }
    public static List<Address> toListAddresses(List<AddressEntity> listAddressEntities) {
        return listAddressEntities
                .stream()
                .map(AddressConverter::toAddress)
                .toList();
    }
    public static List<AddressEntity> toListAddressEntities(List<Address> listAddress) {
        return listAddress
                .stream()
                .map(AddressConverter::toAddressEntity)
                .toList();
    }


}
