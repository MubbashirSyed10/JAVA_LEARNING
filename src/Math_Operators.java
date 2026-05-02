public class Math_Operators {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int result = 5 + 3 * 2;
        System.out.println(result);

        int result2 = a / b + 3 * 2 - 1;
        System.out.println(result2);

        int x = 1;
        int y = x + ++x;
        System.out.println("y is " + y);

        String name1 = new String("Zaid");
        String name2 = new String("Zaid");
        String name3 = "Zaid";
        String name4 = "Zaid";
        boolean equals = name1.equals(name2);
        System.out.println(equals);
        System.out.println(name1.equals(name3));

        System.out.println(name3 == name4);

        System.out.println("Hello" == "Hello");
    }
}
