package Enums;

public class enumDemo {
    public static void main(String[] args) {
        System.out.println(Day.FRIDAY);

        Day monday = Day.MONDAY;
        Day sunday = Day.SUNDAY;
        System.out.println(monday.compareTo(Day.SUNDAY));
        System.out.println(monday.equals(Day.TUESDAY));
        System.out.println(monday.hashCode());
        System.out.println(sunday.ordinal());
        try {
            System.out.println(Day.valueOf("WEDNESDAYS"));
        } catch (Exception e){
            System.out.println("No matching enum found.");
        }

        Day[] values = Day.values();
        for(Day i:values){
            System.out.println("Printing value of Day " + i);
        }

        Day day2 = Day.TUESDAY;
        day2.display();


        Day day3 = Day.MONDAY;
        switch (day3){
            case MONDAY -> {
                System.out.println("Aaj hai Monday");
            }
            case TUESDAY -> {
                System.out.println("Aaj hai tuesday");
            }
            default -> {
                System.out.println("Aaj hai default");
            }
        }
    }
}
