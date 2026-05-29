import java.util.Scanner;
public class Inheritance{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Animal a=new Animal();
        Dog d=new Dog();
        a.makeSound();
        d.makeSound();
    }
}
class Animal{
    void makeSound(){
        System.out.println("Animal sound");
    }
}
class Dog{
    void makeSound(){
        System.out.println("Bark");
    }
}