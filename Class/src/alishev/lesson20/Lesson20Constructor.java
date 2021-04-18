package alishev.lesson20;

public class Lesson20Constructor {

    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Animal animal2 = new Animal("Frosya");
        Animal animal3 = new Animal("Sonya", "Cat");
        Animal animal4 = new Animal("Tima", "Cat", 5);
        Animal animal5 = new Animal("Palma", "Dog", 12, "gav-gav");

        animal1.info();
        animal2.info();
        animal3.info();
        animal4.info();
        animal5.info();

        System.out.println(animal5);

    }

}

class Animal {

    private String name;
    private String type;
    private int age;
    private String say;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSay() {
        return say;
    }

    public void setSay(String say) {
        this.say = say;
    }

    public Animal() {
        System.out.println("Это Первый конструктор");
    }

    public Animal(String name) {
        this.name = name;
        System.out.println("Это Второй конструктор");
    }

    public Animal(String name, String type) {
        this.name = name;
        this.type = type;
        System.out.println("Это Третий конструктор");
    }

    public Animal(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;
        System.out.println("Это Четвертый конструктор");
    }

    public Animal(String name, String type, int age, String say) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.say = say;
        System.out.println("Это Пятый конструктор");
    }

    public void info() {
        if (name==null){name="У животного нет имени...";}
        if (type==null){type="неизвестный вид";}
        if (age==0){age=100;}
        if (say==null){say="У животного нет имени...";}

        System.out.printf("У меня живут эти животные: %s, %s, %d лет, %s.", name, type, age, say);
        System.out.println();
    }

    public String toString(){
        return name+", "+type+", "+age+", "+say;
    }


}
