import jdk.dynalink.linker.LinkerServices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class MergeArray {
    public static void main(String[] args) {
        int arr[]={1,4,2,7,9};

        int arr2[]={3,6,5};

        int length1 = arr.length;
        int length2 = arr2.length;
        List list=new ArrayList();

        for (int i=0;i<length1;i++){
            list.add(arr[i]);
        }
        for (int j=0;j<length2;j++){
            list.add(arr2[j]);
        }
        Collections.sort(list);
        List list1=new ArrayList();
                for (int i=0;i<length1;i++){
                    list1.add(list.get(i));
                }
        List list2=new ArrayList();
                for (int i=0;i< arr2.length;i++){
                    list2.add(list.get(length1+i));
                }
        System.out.println(list1);
        System.out.println(list2);


//        int[] numbers = {5, 2, 8, 1, 7};
//
//        // Sorting the array
//        Arrays.sort(numbers);
//
//        // Print the sorted array
//        System.out.println("Sorted Array: " + Arrays.toString(numbers));
    }
}
