package com.recruitment.third_task;

import com.recruitment.third_task.figures.Block;
import com.recruitment.third_task.figures.Figure;

public class ThirdProgram {

    AreaComparer areaComparer;
    VolumeComparer volumeComparer;

    public ThirdProgram(){
        areaComparer = new AreaComparer();
        volumeComparer = new VolumeComparer();
    }

    public void compareAreas(Figure one, Figure two){
         int result = areaComparer.Compare(one, two);
         switch (result){
             case -1:
                 System.out.println("The first is bigger.");
                 break;
             case 0:
                 System.out.println("They're equal.");
                 break;
             case 1:
                 System.out.println("The second is bigger.");
                 break;
         }
    }

    public void compareVolumes(Block one, Block two) {
        int result = volumeComparer.compare(one, two);
        switch (result) {
            case -1:
                System.out.println("The first is bigger.");
                break;
            case 0:
                System.out.println("They're equal.");
                break;
            case 1:
                System.out.println("The second is bigger.");
                break;
        }

    }

}





