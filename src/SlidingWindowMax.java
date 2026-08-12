import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.MIN_VALUE;

public class SlidingWindowMax {
    public static void main(String[] args) {
        SlidingWindowMax obj = new SlidingWindowMax();

        int[] arr = {4, 0, -1, 3, 5, 3, 6, 8};
        int k = 3;

        List<Integer> ans = obj.maxSlidingWindow(arr, k);

        for (int num : ans) {
            System.out.print(num + " ");
        }
    }

    public List<Integer> maxSlidingWindow(int[] arr, int k) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < arr.length - k; i++) {
            int max = arr[i];
            for (int j = i; j < i + k; j++) {
                max = Math.max(max, arr[j]);
            }
            result.add(max);
        }
        return result;
    }
}
