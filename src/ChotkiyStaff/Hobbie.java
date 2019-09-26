package ChotkiyStaff;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Hobbie {
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Hobbie{" +
                "title='" + title + '\'' +
                '}';
    }

    public Hobbie(String title) {
        this.title = title;
    }

    public static Hobbie selectRandomHobby() {
        Random random = new Random();
        String[] hobbies = {"swimming", "football", "smoking", "dancing", "codding", "sleepping"};
        int randIndex = random.nextInt(hobbies.length-1);
        String randHobby= hobbies[randIndex];
        return new Hobbie(randHobby);
    }
}
