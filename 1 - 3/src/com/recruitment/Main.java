package com.recruitment;

import com.recruitment.first_task.FirstProgram;
import com.recruitment.second_task.CountCharacters;
import com.recruitment.second_task.ReadFile;
import com.recruitment.second_task.SecondProgram;
import com.recruitment.third_task.ThirdProgram;
import com.recruitment.third_task.figures.Circle;
import com.recruitment.third_task.figures.Cube;
import com.recruitment.third_task.figures.Sphere;

public class Main {

    public static void main(String[] args) {

        String path = "D:\\logger.txt";
        SecondProgram program = new SecondProgram(path);

        CountCharacters count = new CountCharacters("aassdd");

        program.runProgram();

        //count.appearanceCount();


    }
}
