package AbstractVsInterf;

public class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Gav");
    }

    @Override
    public void run() {
        System.out.println("Dog runs");

    }
}
