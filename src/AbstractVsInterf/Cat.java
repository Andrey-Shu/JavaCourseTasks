package AbstractVsInterf;

public  class Cat extends Animal{

    @Override
    public void makeSound() {
        System.out.println("Myau");
    }

    @Override
    public void run() {
        System.out.println("Cat runs");
    }
}
