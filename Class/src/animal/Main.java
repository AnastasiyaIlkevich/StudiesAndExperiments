package animal;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.eat();
        animal.sleep();

        System.out.println();

        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
        dog.bark();



    }

}
