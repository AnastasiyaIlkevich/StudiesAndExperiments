package lesson14_15_16ClassAndObject;

public class ClassAndObject {

    public static void main(String[] args) {

        Person person1 = new Person();
        person1.setName("Anastasiya");
        person1.setAge(30);
        person1.setSay("I study java!");
        System.out.println(person1.getName() + ", " + person1.getAge() + ", " + person1.getSay());

        person1.speak();
        System.out.println("до пенсии осталось " + person1.egeConklueter() + " года");
        System.out.println();

    }

}

class Person {

    private String name;
    private int age;
    private String say;

    public void setAge(int age1) {
        if (age1 < 0) {
            System.out.println("ошибка. Проверте ввод возраста пользователя");
        } else {
            age = age1;
        }
    }
    public int getAge() {
        return age;
    }


    public void setSay(String say1) {
        say = say1;
    }
    public String getSay() {
        return say;
    }


    public void setName(String username) {
        if (username.isEmpty()) {
            System.out.println("ошибка. Проверте ввод имени пользователя");
        } else {
            name = username;
        }
    }
    public String getName() {
        return name;
    }


    void speak() {
        System.out.println(name + " ---> " + age + " лет " + say);
    }

    int egeConklueter() {
        int years = 65 - age;
        return years;//возвращает и прекращает работу метода
    }
}