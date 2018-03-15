package hello;

public class Start {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal mrFlip = new Human();

        System.out.println(myDog.sayHello());
        System.out.println(mrFlip.sayHello());
    }
}