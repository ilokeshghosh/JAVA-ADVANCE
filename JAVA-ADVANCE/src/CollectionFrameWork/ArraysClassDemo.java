package CollectionFrameWork;

import java.util.Arrays;

public class ArraysClassDemo {
    public static void main(String[] args) {
        int[] numbers ={1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        //Binary Search in Array
        int index = Arrays.binarySearch(numbers,4);
        System.out.println("The index of element 4 in the array is "+index);

        //Sorting Array
        int[] numbers2 ={100, 20, 3, 43, 5, 64, 79, 89, 9, 10};
        Arrays.sort(numbers2);

        // Used when prefilled value is need in a Array
       Arrays.fill(numbers2,12);

        for(int i:numbers2){
            System.out.print(i+" ");
        }
    }
}
