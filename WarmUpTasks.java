package day37_ArrayList;
import Library.Util;

public class WarmUpTasks {
    /* Write a program that can find the unique character from string
                DO NOT use nested loop
                "ABABCDEE"
                output:  C D
     */
    public static void main(String[] args) {
        String str = "ABABCDD";

       String a =  Util.uniques(str);
        System.out.println(a);




    /* Write a program that can find the frequency of characters from a string
            DO NOT use nested loop
            "AABBCCDDEE"==>  "ABCDE"
            output: A2B2C2D2E2
     */

        String str1 = "AABBCCDDEE";
        String  a1 = Util.frequencyOfChars(str1);
        System.out.println(a1);




















    }
}
