package ClassLearnings.Abstraction;

public abstract class Animal {
    protected abstract void sayHello();

    // abstract class can have regular methods as well.

    public void sleep(){
        System.out.println("Zzz");
    }
}
