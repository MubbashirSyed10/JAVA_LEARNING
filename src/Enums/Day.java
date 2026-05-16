package Enums;

public enum Day {
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday"),
    SUNDAY("Sunday");

    private String lower;

    private Day(String lower){
        this.lower = lower;
        System.out.println("Constructor called");
        System.out.println("CONSTRUCTOR of " + this.lower);
    }

    public void display(){
        System.out.println("Today is " + this.name());
    }


}