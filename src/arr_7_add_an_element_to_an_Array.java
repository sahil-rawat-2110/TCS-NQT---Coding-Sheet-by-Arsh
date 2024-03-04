//7 Add an element to an Array

import java.util.*;
public class arr_7_add_an_element_to_an_Array {

        // Function to add x in arr
        static Integer[] addX(int n, Integer arr[], int x){
            int i;
            List<Integer> arrlist = new ArrayList<Integer>(Arrays.asList(arr));
            arrlist.add(x);
            arr = arrlist.toArray(arr);
            return arr;
        }
        public static void main(String[] args){
            int n = 10;
            int i;
            Integer arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
            System.out.println("Initial Array:\n" + Arrays.toString(arr));
            int x = 50;  //add element
            arr = addX(n, arr, x);
            System.out.println("\nArray with " + x + " added:\n" + Arrays.toString(arr));
        }
    }

