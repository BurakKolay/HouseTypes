package org.burakkolay;

import org.burakkolay.service.BuildService;
import org.burakkolay.service.HouseService;

public class Main {
    public static void main(String[] args) {
        BuildService buildService = new BuildService();
        HouseService houseService = new HouseService();

        System.out.println("************************--HOUSE--************************");
        houseService.totalPrices(buildService.createHouse());
        houseService.averageSize(buildService.createHouse());
        System.out.println("************************--VILLA--************************");
        houseService.totalPrices(buildService.createVilla());
        houseService.averageSize(buildService.createVilla());
        System.out.println("************************--SUMMERHOUSE--************************");
        houseService.totalPrices(buildService.createSummerhouse());
        houseService.averageSize(buildService.createSummerhouse());

        System.out.println("************************--ALL BUILD TYPE--************************");
        houseService.totalPrices(buildService.createAllBuilds());
        houseService.averageSize(buildService.createAllBuilds());

        houseService.whichTypeHouseIsItForRoomAndSaloon(2,4);
    }
}