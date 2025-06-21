public class Arrays {
    public static void main (String [] args){
        int [] array = {1,2,3};
        int [] intarray = new int[10];
        intarray[2] = 221;
        intarray[1] = 22;

        // For each loop
        for(int i : intarray){
            System.out.println(i);
        }

        //Search an element in an array
        int ele = 10;
        int [] arr = {1,2,3,4,1,6,7,8};
        for(int i : arr){
            if(i == ele){
                System.out.println("Element found !!");
                break;
            }else {
                System.out.println("Not found yet... Searching...");
            }
        }

        // Find max
        int max = Integer.MIN_VALUE;
        for( int i : arr){
            if(max < i){
                max = i;
            }
        }
        System.out.println("Max element is " + max);

        // Reverse array
        for(int i = arr.length - 1; i>=0 ; i--){
            System.out.println(arr[i]);
        }

        // Sum of the array
        int sum = 0;
        for (int a : arr){
            sum += a;
        }
        System.out.println("Sum of the array is " + sum);
    }
}
