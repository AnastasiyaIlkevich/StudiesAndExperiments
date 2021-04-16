package lesson19;

public class Lesson19 {

    public static void main(String[] args) {

        Human human1 = new Human();
        human1.setAge(25);
        human1.setName("Astarosiya");
        human1.getInfo();
    }
}
class Human{

    private String name;
    private int age;

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName (String name){
        return name;
    }

    public int getAge (int age){
        return age;
    }

    public void getInfo (){
        System.out.println(name+ ", "+age);
    }

}