public class Test_Car {
    public static void main(String [] args){
        Car car = new Car();
//        car.brand = "Hyundai";
//        car.model = "2025";
//        car.speed = 60;
        car.setSpeed(60);
        System.out.println("Getter speed -> " + car.getSpeed());
        System.out.println(car.accelerate(20));
        System.out.println("De accelerate "+ car.deaccelarate(10));
    }
}
