package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Practice {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,1,2,2,2,3,3,4,4,5,6,6,6,6,7,7));

        //remove all the numbers that are less than 5

        for(int i = 0; i<=list.size()-1;i++){
            Predicate<Integer> lessThan5 = each ->  each<5;
          list.removeIf(lessThan5);
        }
        System.out.println(list);


        System.out.println("=======================================================================");



    }
}
