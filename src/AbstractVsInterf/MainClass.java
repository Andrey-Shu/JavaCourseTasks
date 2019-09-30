package AbstractVsInterf;

public class MainClass {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.makeSound();
        animal.run();
        animal = new Cat();
        animal.makeSound();
        animal.run();
        new Dog().run();
    }

}
