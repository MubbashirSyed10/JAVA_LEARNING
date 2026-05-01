package animals;

public class RunAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sayHello();

        Cat cat = new Cat();
        cat.sayHello();

        // We can also write this as
        // Animal dog = new Dog();
        Dog dog = new Dog();
        dog.sayHello();
    }
}
