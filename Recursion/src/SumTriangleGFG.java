
import java.util.Arrays;

public class SumTriangleGFG {
//    https://www.geeksforgeeks.org/sum-triangle-from-array/
//Given an array of integers, print a sum triangle from it such that the first level has all array elements. From then, at each level number of elements is one less than the previous level and elements at the level is be the Sum of consecutive two elements in the previous level.
//    Input : A = {1, 2, 3, 4, 5}
//    Output : [48]
//            [20, 28]
//            [8, 12, 16]
//            [3, 5, 7, 9]
//            [1, 2, 3, 4, 5]
public static void sum(int[]arr){
    if(arr.length<1){
        return;
    }
    int[] ans = new int[arr.length-1];
    for (int i = 0; i < arr.length-1; i++) {
        ans[i]=arr[i]+arr[i+1];
    }
    sum(ans);
    System.out.println(Arrays.toString(arr));
}

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        sum(a);
    }
}
