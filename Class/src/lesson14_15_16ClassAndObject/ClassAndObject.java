package lesson14_15_16ClassAndObject;

public class ClassAndObject {

    public static void main(String[] args) {

        Person person1 = new Person();
        person1.name = "Anastasiya";
        person1.age = 30;
        person1.say = "I study java!";

        Person person2 = new Person();
        person2.name = "Sasha";
        person2.age = 32;
        person2.say = "I study dance!";



        person1.speak();
        System.out.println("до пенсии осталось "+ person1.egeConklueter()+" года");
        System.out.println();
        person2.speak();
        System.out.println("до пенсии осталось "+ person2.egeConklueter()+" года");

    }

}

class Person {

    String name;
    int age;
    String say;

    void speak(){
        System.out.println(name + " ---> " + age + " лет " + say);
    }

    int egeConklueter(){
        int years = 65-age;
        return years;//возвращает и прекращает работу метода
    }
}