package ClassesAndMethods;

public class Animal {
    public static int age;
    public int weight;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Animal(int age) {
        this.age = age;
    }

    public Animal getObject(){
        return this;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                '}';
    }
}
