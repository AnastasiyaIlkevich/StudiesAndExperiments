package alishev.lesson20;

public class Lesson24ToString {
    public static void main(String[] args) {

        Copybook copybook1 = new Copybook(16, "клетАчка");
        Copybook copybook2 = new Copybook(32, "линеЯчка");
        Copybook copybook3 = new Copybook(64, "алЬбом");
        System.out.println(copybook1);
        System.out.println(copybook2);
        System.out.println(copybook3);

    }
}

class Copybook {

    private int pages;
    private String type;

    public Copybook(int pages, String type) {

        this.pages = pages;
        this.type = type;

    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPages(int pages) {
        return pages;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType(String type) {
        return type;
    }

    public String toString(){
        return pages+", "+type;
    }

}