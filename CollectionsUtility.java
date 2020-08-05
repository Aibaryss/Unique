package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(30,20,56,78,98,100,20,0,-1,-3,500,400,5000));

        // max number
        Integer a =Collections.max(list);
        System.out.println(a);

        //min number
        Integer b = Collections.min(list);
        System.out.println(b);


        System.out.println("======================================================");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Ramazan","Isem","Muhtar","Saim","Asiya","Muhtar"));

        //replaceAll
        Collections.replaceAll(names, "Muhtar","Cody");
        System.out.println(names);

    }
}
