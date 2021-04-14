package interfaces;

public class Animal implements Info{

    public int id;

    public Animal(int id){
        this.id = id;
    }

public void eat(){
    System.out.println("Animals is eating");
}

    @Override
    public void sayInfo() {
        System.out.println("Animal is ID: "+this.id);
    }
}
