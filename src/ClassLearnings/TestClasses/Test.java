package ClassLearnings.TestClasses;

public class Test {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println("Speed before acceleration "+car.getSpeed());
        car.accelerate(29);
        System.out.println("Speed after "+car.getSpeed());

        car.setColor("Grey");
        car.brake(7);
        System.out.println("speed after applying brake "+ car.getSpeed());

        car.setYear(20);
        System.out.println("Get year "+ car.getYear());
    }
}
