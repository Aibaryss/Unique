package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class BulkOperations {
    public static void main(String[] args) {

        // containsAll(CollectionType): returns boolean
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        boolean r = list.contains(1); // true

        ArrayList<Integer> elements = new ArrayList<>();
        elements.add(1);
        elements.add(2);
        elements.add(4);

        boolean r1 = list.containsAll(elements); //true
        System.out.println(r1);

        System.out.println("==================================================================");

        //Arrays.asList(): takse non-primitive array or array of values
                            // returns collectiontype
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);


        // verify that 1, 2, 4 are contained in the list2

        boolean r3 = list2.containsAll(Arrays.asList(10, 20, 4));

        Integer[] arr = {10, 20, 4};
        boolean r4 = list2.containsAll(Arrays.asList(arr));

        System.out.println(r3);

        System.out.println("===========================================================================");


        ArrayList<Integer> number = new ArrayList<>();
        Integer[] nums = {30,25,40,15,55,65,75,85,95,100};
        number.addAll(Arrays.asList(nums));

        System.out.println(number);


        System.out.println("======================================================");

        //removeAll(): removes all matching ones
        ArrayList<Integer> number1 = new ArrayList<>();
        number1.addAll(Arrays.asList(1,1,2,2,3,4,5,5,6,7,8,9,10,11,12,13));

        number1.removeAll(Arrays.asList(1,5));
        System.out.println(number1);


        System.out.println("======================================================");

        //retainAll(): removes all the not matching ones
        ArrayList<Integer> num1 = new ArrayList<>();
        num1.addAll(Arrays.asList(1,1,2,2,3,4,5,5,6,7,8,8,9,10,10,11,12,13));

        num1.retainAll(Arrays.asList(1,2,8,10));
        System.out.println(num1);


        System.out.println("==========================================================");

        /*removeIf(Predicate):removes the elements that are matching with the if condition
            Predicate: applied to the CollectionTypes
                        Predicate<Integer> startF= p -> boolean Expression
         */
























    }
}