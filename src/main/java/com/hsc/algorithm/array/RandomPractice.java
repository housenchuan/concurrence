package com.hsc.algorithm.array;

import java.util.Random;

public class RandomPractice {

    public int rand10(){
        while (true){
            int random48 = (rand7()-1)*7+rand7()-1;
            if(random48<=39){
                return random48/4+1;
            }
        }
    }

    public int rand7(){
        Random random = new Random();
        return random.nextInt(7);
    }
}
