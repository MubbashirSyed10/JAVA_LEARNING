public class Car {
    private String color;
    private String brand;
    private String model;
    private int speed;
    private int year;
    public Car(){
        this.color = "Black";
        this.brand = "BMW";
    }
    public int accelerate (int increment){
        speed += increment;
        return speed;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int deaccelarate (int decrement){
        speed -=  decrement;
        if(speed < 0){
            speed = 0;
        }
        return speed;
    }
}
