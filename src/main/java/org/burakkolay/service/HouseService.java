package org.burakkolay.service;


import org.burakkolay.entity.BaseBuild;
import org.burakkolay.entity.House;
import org.burakkolay.entity.Summerhouse;
import org.burakkolay.entity.Villa;

public class HouseService {
    BuildService buildService = new BuildService();

    public void totalPrices(BaseBuild[] baseBuilds) {
        int total = 0;
        for (BaseBuild baseBuild : baseBuilds)
            total += baseBuild.getPrice();
        System.out.println("Total price:" + total);
    }

    public void averageSize(BaseBuild[] baseBuilds) {
        int avg = 0;
        for (BaseBuild baseBuild : baseBuilds)
            avg += (baseBuild.getSize());
        System.out.println("Average size:" + (avg/3));
    }

    public void whichTypeHouseIsItForRoomAndSaloon(int room, int saloon) {

        House[] houseList = buildService.createHouse();
        Villa[] villaList = buildService.createVilla();
        Summerhouse[] summerHouseList = buildService.createSummerhouse();
        for (House house : houseList) {
            if ((house.getSaloon()==saloon) && (house.getRoom() == room))
                System.out.println("This is a house. ");
        }
        for (Villa villa : villaList) {
            if (villa.getSaloon() == saloon && villa.getRoom() == room)
                System.out.println("This is a villa.");
        }
        for (Summerhouse summerHouse : summerHouseList) {
            if (summerHouse.getSaloon() == saloon && summerHouse.getRoom() == room)
                System.out.println("This is a summer house.");

        }
    }
}
