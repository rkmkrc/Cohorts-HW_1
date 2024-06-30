package org.erkam;

import org.erkam.model.PropertyList;
import org.erkam.service.PropertyService;

public class Main {
    public static void main(String[] args) {
        PropertyList propertyList = new PropertyList();
        PropertyService propertyService = new PropertyService(propertyList);

        System.out.println("Total price of houses: " + propertyService.getTotalPriceOfHouses());
        System.out.println("Total price of villas: " + propertyService.getTotalPriceOfVillas());
        System.out.println("Total price of summer houses: " + propertyService.getTotalPriceOfSummerHouses());
        System.out.println("Total price of all properties: " + propertyService.getTotalPriceOfAllProperties());

        System.out.println("Average square meter of houses: " + propertyService.getAverageSquareMeterOfHouses());
        System.out.println("Average square meter of villas: " + propertyService.getAverageSquareMeterOfVillas());
        System.out.println("Average square meter of summer houses: " + propertyService.getAverageSquareMeterOfSummerHouses());
        System.out.println("Average square meter of all properties: " + propertyService.getAverageSquareMeterOfAllProperties());

        System.out.println("Properties with 4 rooms and 2 living rooms: " +
                propertyService.filterPropertiesByRoomAndLivingRoom(4, 2));
    }
}