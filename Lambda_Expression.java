package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Predicate;

public class Lambda_Expression {
    public static void main(String[] args) {


        ArrayList<Integer> num = new ArrayList<>();
        num.addAll(Arrays.asList(1,3,4,5,6,5,6,7,8,9,99,11,34));

        Predicate<Integer> lessThan5 = each -> each<5;
        num.removeIf(lessThan5);
        //num.removeIf((each -> each <5));
        System.out.println(num);


        System.out.println("================================================");

        Predicate<Integer> oddNumbers = each -> each%2!=0;
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i = 0; i<=100; i++){
            numbers.add(i);
        }
        numbers.removeIf(oddNumbers); // remove if the number is odd
        numbers.removeIf(p -> p%2==0);  // remove if the number is even
        System.out.println(numbers);

        System.out.println("======================================================================");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Mary","Monica","Mehray","Musti","Sumail","Hasan","Berlin"));
        names.removeIf(each ->each.startsWith("M")&&each.endsWith("y"));
        System.out.println(names);


        System.out.println("==================================================================");

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1,1,1,2,2,2,3,3,3,4,5,6,7,8,8,9));

        nums.removeIf(p-> Collections.frequency(nums,p)!=1); // for the element that are not unique
        System.out.println(nums);







    }
}
