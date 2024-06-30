package org.erkam.model;

import java.util.ArrayList;
import java.util.List;

public class PropertyList {
    private List<House> houseList = new ArrayList<>();
    private List<Villa> villaList = new ArrayList<>();
    private List<SummerHouse> summerHouseList = new ArrayList<>();

    public PropertyList() {
        // Initialize with some sample data
        houseList.add(new House(100000, 120, 3, 1));
        houseList.add(new House(150000, 150, 4, 1));
        houseList.add(new House(200000, 180, 5, 2));

        villaList.add(new Villa(500000, 300, 5, 2));
        villaList.add(new Villa(750000, 350, 6, 3));
        villaList.add(new Villa(1000000, 400, 7, 4));

        summerHouseList.add(new SummerHouse(300000, 200, 4, 2));
        summerHouseList.add(new SummerHouse(400000, 250, 5, 3));
        summerHouseList.add(new SummerHouse(500000, 300, 6, 4));
    }

    public List<House> getHouseList() {
        return houseList;
    }

    public List<Villa> getVillaList() {
        return villaList;
    }

    public List<SummerHouse> getSummerHouseList() {
        return summerHouseList;
    }
}
