import java.util.*;
public class ClassObject{
    public static void main(String[] args) {
        Car c1=new Car();
        c1.make="Toyota";
        c1.model="Carmy";
        c1.year=2026;
        c1.displayDetails();
    }
}
 class Car{
    String make,model;
    int year;
    void displayDetails(){
        System.out.println(make+" "+model+" "+year);
    }
}
