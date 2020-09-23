// OOP
// Polymorphism
// Method overriding
// Single Inheritance

// Parent class
class Animals {
    public void Sound() {
        System.out.println("Animals Sound");
    }
}
// sub-class
class Dog extends Animals {
    public void Sound() {
        System.out.println("woof");
    }
}
//sub-class
class Cat extends Animals {
    public void Sound() {
        System.out.println("meow");
    }
}
public class Sample_14 {
    public static void main(String[] args) {

        Animals pet;
        
        pet = new Dog();
        pet.Sound();

        pet = new Cat();
        pet.Sound();
    }
}
