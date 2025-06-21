public class loops {
    public static void main(String [] args){
        for(int i = 1; i<=10000; i = i * 10){
            System.out.println(i);
        }

        // count digits of a number
        // 4678823
        int num = 4678823;
        int count = 0;
        while (num > 0){
            count++;
            num = num/10;
        }
        System.out.println(count);

//        *
//        **
//        ***
//        ****

        for (int i = 0 ;i < 5; i++){
            for(int j = 0 ; j <=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        int arr[] = {1,2,3,4,5};
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
