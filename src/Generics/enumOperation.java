package Generics;

public class enumOperation {
    public static void main(String[] args) {
        double add = Operation.ADD.apply(10,20);
        System.out.println("Add -> " + add);

        double sub = Operation.SUBTRACT.apply(30,15);
        System.out.println("Subtract -> " + sub);

        double mul = Operation.MULTIPLY.apply(12,12);
        System.out.println("Mul -> " + mul);
    }
}
