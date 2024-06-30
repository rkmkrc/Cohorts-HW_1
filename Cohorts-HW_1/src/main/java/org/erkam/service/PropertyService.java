package org.erkam.service;

import org.erkam.model.Property;
import org.erkam.model.PropertyList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PropertyService {
    private PropertyList propertyList;

    public PropertyService(PropertyList propertyList) {
        this.propertyList = propertyList;
    }

    public double getTotalPriceOfHouses() {
        return propertyList.getHouseList().stream().mapToDouble(Property::getPrice).sum();
    }

    public double getTotalPriceOfVillas() {
        return propertyList.getVillaList().stream().mapToDouble(Property::getPrice).sum();
    }

    public double getTotalPriceOfSummerHouses() {
        return propertyList.getSummerHouseList().stream().mapToDouble(Property::getPrice).sum();
    }

    public double getTotalPriceOfAllProperties() {
        return getTotalPriceOfHouses() + getTotalPriceOfVillas() + getTotalPriceOfSummerHouses();
    }

    public double getAverageSquareMeterOfHouses() {
        return propertyList.getHouseList().stream().mapToDouble(Property::getSquareMeter).average().orElse(0);
    }

    public double getAverageSquareMeterOfVillas() {
        return propertyList.getVillaList().stream().mapToDouble(Property::getSquareMeter).average().orElse(0);
    }

    public double getAverageSquareMeterOfSummerHouses() {
        return propertyList.getSummerHouseList().stream().mapToDouble(Property::getSquareMeter).average().orElse(0);
    }

    public double getAverageSquareMeterOfAllProperties() {
        List<Property> allProperties = new ArrayList<>();
        allProperties.addAll(propertyList.getHouseList());
        allProperties.addAll(propertyList.getVillaList());
        allProperties.addAll(propertyList.getSummerHouseList());
        return allProperties.stream().mapToDouble(Property::getSquareMeter).average().orElse(0);
    }

    public List<Property> filterPropertiesByRoomAndLivingRoom(int rooms, int livingRooms) {
        List<Property> allProperties = new ArrayList<>();
        allProperties.addAll(propertyList.getHouseList());
        allProperties.addAll(propertyList.getVillaList());
        allProperties.addAll(propertyList.getSummerHouseList());
        return allProperties.stream()
                .filter(p -> p.getRooms() == rooms && p.getLivingRooms() == livingRooms)
                .collect(Collectors.toList());
    }
}
