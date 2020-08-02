package day37_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Unique {
    public static void main(String[] args) {

        String str = "ABABCDD";
        ArrayList<Character> list = new ArrayList<>();

        for(char each : str.toCharArray()){
            list.add(each);
        }
        System.out.println(list);

        for(char each : list) {
            int count = Collections.frequency(list, each);
            if (count == 1) {
                System.out.println(each);
            }
        }

    /*
        String uniques =="";
        for(String each : str.split("")){
                list.add(each);
        }
        for(String each : list){
            int count  =Collections.frequency(list, "A");
                 if(count ==1){
                 uniques+=each;
        }

        }
            System.out.println(uniques);
     */
    }
}
