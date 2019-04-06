package Requests1;

//*******************************************************************
// Program Klasa Human
// Michał Kaczmarek s18464 i Adrian Matyszczak s19850
//
//*******************************************************************


public class Human {

    private int age;
    private int weight;
    private int height;
    private String name;
    private String isMale;
    private int feetSize;
    private long indexNumber;

    public Human(int age, int weight, int height, String name, String isMale, int feetSize, long indexNumber) {
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.name = name;
        this.isMale = isMale;
        this.feetSize = feetSize;
        this.indexNumber = indexNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsMale() {
        return isMale;
    }

    public void setIsMale(String isMale) {
        this.isMale = isMale;
    }

    public int getFeetSize() {
        return feetSize;
    }

    public void setFeetSize(int feetSize) {
        this.feetSize = feetSize;
    }

    public long getIndexNumber() {
        return indexNumber;
    }

    public void setIndexNumber(long indexNumber) {
        this.indexNumber = indexNumber;
    }

    public static void main(String[] args) {


    }
    Human Michal = new Human(33,105,200,"Michal","Tak",50,18464);
    Human Adrian = new Human(29,100,196,"Adrian","Tak",50,19850);
}
