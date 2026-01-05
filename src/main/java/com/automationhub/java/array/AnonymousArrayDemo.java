package com.automationhub.java.array;

public class AnonymousArrayDemo {

    public static void main(String[] args) {
       int addition =  sum(new int[]{10, 20, 30});
        System.out.println(addition);
    }

    public static int sum(int[] arr) {
        int total = 0;
        for (int n : arr) {
            total += n;
        }
        return total;
    }
}


/*Why Do We Need Anonymous Arrays?

✔ Reduce extra variable creation
✔ Clean & readable code
✔ Pass data directly to methods
✔ Useful in utility/helper methods

An anonymous array is:

An array created without assigning it to a variable name.

It is used only once, usually while passing data to a method.

*/
