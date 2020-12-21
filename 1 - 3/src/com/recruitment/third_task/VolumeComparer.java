package com.recruitment.third_task;

import com.recruitment.third_task.figures.Block;

public class VolumeComparer {

    public int compare(Block block1, Block block2){
        if (block1.getVolume() > block2.getVolume()){
            return -1; }
        if (block1.getVolume() == block2.getVolume()){
            return  0; }
        return 1;
    }
}
