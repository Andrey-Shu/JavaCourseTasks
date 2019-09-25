package CollectionTaskWithString;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionMainClassWithString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> stringList = new ArrayList();
        String str = "";
        do {
            System.out.print("Input string ->");
            str = scanner.nextLine();
            stringList.add(str);
        } while (!str.equals("stop"));
        System.out.println("Inputed word 'stop'");
        System.out.println("First inputed string->" + stringList.get(0));
    }
}
