package ClassesAndMethods;

public class BaseClass {
    public static void main(String[] args) {
        Animal animal1 = new Animal( 4);
        System.out.println(Animal.age);
        System.out.println(animal1.getAge());
        Animal animal2 = new Animal( 2);
        System.out.println(animal1);
        System.out.println(animal2);

        Animal.age =6;
        System.out.println(animal1);
        System.out.println(animal2);
        System.out.println(animal1.getAge());
        System.out.println(animal2.getAge());


//
//        Page page = new Page();
//        page.click2().click1().click2();
//                page.click2();
//                 page.click1();
   }
}
