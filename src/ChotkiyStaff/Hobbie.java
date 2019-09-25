package ChotkiyStaff;

import java.util.ArrayList;
import java.util.Random;

public class Hobbie {

    public static void selectRandomHobby(String hobby){
        Random random = new Random();

        ArrayList hobbyList = new ArrayList();
        hobbyList.add("swimming");
        hobbyList.add("football");
        hobbyList.add("smoking");
        hobbyList.add("dancing");
        hobbyList.add("codding");
        hobbyList.add("sleepping");
        int randIndex = random.nextInt(6);
        hobby = hobbyList.get(randIndex);


    }
}
