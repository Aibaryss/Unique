package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations_Practice {
    public static void main(String[] args) {


        ArrayList<String> students = new ArrayList<>();
        students.addAll(Arrays.asList("Sayeem","Waqar","James","Scott","Micheal","David"));

        boolean r = students.containsAll(Arrays.asList("Ulku","Bursa"));
        boolean r1 = students.containsAll(Arrays.asList("Micheal","David"));
        System.out.println(r);
        System.out.println(r1);

        System.out.println("===================================================");

        ArrayList<String> group13 = new ArrayList<>();
        String[] names = {"James","Paul","Blake","Nathan","Smith","Josh","Dwade","Kobe"};
        group13.addAll(Arrays.asList(names));
        System.out.println(group13);
        boolean r2 =  group13.containsAll(Arrays.asList("Doc","Booker"));
        System.out.println(r2);


        System.out.println("=====================================================");

        ArrayList<String> name = new ArrayList<>();
        name.addAll(Arrays.asList("Ahmed","Ali","Ismet","Ismail","Ahmed", "Ahmed"));

        name.removeAll((Arrays.asList("Ahmed")));
        System.out.println(name);







    }
}
