package singleresponsibilityprinciple;

//A Class should have only 1 reason to change

public class Marker {
    String name;
    String color;
    int year;
    int price;
    public Marker(String name, String color, int year, int price){
        this.name = name;
        this.color = color;
        this.year = year;
        this.price = price;
    }
}

