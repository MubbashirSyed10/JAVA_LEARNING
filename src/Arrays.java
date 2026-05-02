public class Arrays {
    public static void main(String[] args) {
        int [] a = new int[10];
        a[0] = 23;
        a[2] = 43;

//        for(int i = 0; i<a.length;i++){
//            System.out.println(a[i]);
//        }
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        for(int i:arr){
            System.out.println(i);
        }
        boolean hasElement = false;
        for(int i:arr){
            if(i == 922){
                hasElement = true;
            }
        }
        System.out.println(hasElement);
        int sum= 0;
        // sum of array
        for(int i : arr){
            sum +=i;
        }
        System.out.println(sum);
    }
}
