package Kvadrat;

import java.util.Scanner;

public class Kvadrat {
  private int sideSquareA;

    public Kvadrat(int sideSquqreA) {
        this.sideSquareA = sideSquqreA;
    }

    public int getSideSquqreA() {
        return sideSquareA;
    }

    public void setSideSquqreA(int sideSquqreA) {
        this.sideSquareA = sideSquqreA;
    }

    @Override
    public String toString() {
        return "Kvadrat{" +
                "sideSquqreA=" + sideSquareA +
                '}';
    }
}
