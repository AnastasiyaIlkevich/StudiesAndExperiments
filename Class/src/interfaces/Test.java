package interfaces;


public class Test {

    public static void main(String[] args) {

        Animal animal = new Animal(1);
        Person person = new Person("Anastasiya");

        Info info1 = new Animal(2);
        Info info2 = new Person("Sasha");

        animal.eat();
        animal.sayInfo();

        System.out.println();

        person.sayHello();
        person.sayInfo();

        System.out.println();

        info1.sayInfo();
        info2.sayInfo();

        System.out.println();

        infoInfo(animal);
        infoInfo(person);

        System.out.println();

        infoInfo(info1);
        infoInfo(info2);

    }

    public static void infoInfo(Info info){

        info.sayInfo();

    }


}
