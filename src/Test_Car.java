public class Test_Car {
    public static void main(String [] args){
        // This is the constructor. Default constuctor
        Car car = new Car();
        System.out.println("Default getColor --> " + car.getColor());
        System.out.println("Default getSpeed --> " + car.getSpeed());
        System.out.println("Default getBrand --> " + car.getBrand());
//        car.brand = "Hyundai";
//        car.model = "2025";
//        car.speed = 60;
        car.setSpeed(60);
        System.out.println("Getter speed -> " + car.getSpeed());
        System.out.println(car.accelerate(20));
        System.out.println("De accelerate "+ car.deaccelarate(10));
    }
}
