package org.burakkolay.service;


import org.burakkolay.entity.BaseBuild;
import org.burakkolay.entity.House;
import org.burakkolay.entity.Summerhouse;
import org.burakkolay.entity.Villa;

public final class BuildService {

    public House[] createHouse(){
        House house1 = new House(500000,120,1,3);
        House house2 = new House(750000,140,2,4);
        House house3 = new House(400000,105,1,2);
        return new House[]{house1,house2,house3};
    }

    public Villa[] createVilla(){
        Villa villa1 = new Villa(5000000,250,2,6);
        Villa villa2 = new Villa(8500000,350,3,8);
        Villa villa3 = new Villa(2500000,210,2,5);
        return new Villa[]{villa1,villa2,villa3};
    }

    public Summerhouse[] createSummerhouse(){
        Summerhouse summerhouse1 = new Summerhouse(400000,90,1,2);
        Summerhouse summerhouse2 = new Summerhouse(650000,110,1,3);
        Summerhouse summerhouse3 = new Summerhouse(250000,70,1,1);
        return new Summerhouse[]{summerhouse1,summerhouse2,summerhouse3};
    }

    public BaseBuild[] createAllBuilds(){
        House house1 = new House(500000,120,1,3);
        House house2 = new House(750000,140,2,4);
        House house3 = new House(400000,105,1,2);

        Villa villa1 = new Villa(5000000,250,2,6);
        Villa villa2 = new Villa(8500000,350,3,8);
        Villa villa3 = new Villa(2500000,210,2,5);

        Summerhouse summerhouse1 = new Summerhouse(400000,90,1,2);
        Summerhouse summerhouse2 = new Summerhouse(650000,110,1,3);
        Summerhouse summerhouse3 = new Summerhouse(250000,70,1,1);
        return new BaseBuild[]{house1,house2,house3,villa1,villa2,villa3,summerhouse1,summerhouse2,summerhouse3};
    }
}
