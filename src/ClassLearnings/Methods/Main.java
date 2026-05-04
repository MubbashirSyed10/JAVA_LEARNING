package ClassLearnings.Methods;

public class Main {
    public static void main(String[] args) {
        int [] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        Main ins = new Main();
        System.out.println("Sum of array is : "+ ins.sum(arr)); // this way to use non static methods by calling the object


        System.out.println("Sum of 2 numbers is : "+ sum(2,3)); // this way to use static methods by direct function call
        System.out.println("Sum of 3 numbers is : "+ sum(3,1,2));
    }
    public int sum(int [] arr){
        int sum = 0;
        for(int i:arr){
            sum+=i;
        }
        return sum;
    }

    public static int sum(int x, int y){
        int sum = 0;
        sum = x + y;
        return sum;
    }
    public static int sum(int x, int y, int z){
        int sum = 0;
        sum = x + y + z;
        return sum;
    }

}
