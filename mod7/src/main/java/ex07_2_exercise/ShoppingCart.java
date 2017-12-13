
package ex07_2_exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShoppingCart {

    int c = 3;
    public static void main (String[] args){
        String custName = "Steve Smith";
        String firstName;
        int spaceIdx = 12;
        int space = 13;
        long num3 = spaceIdx * space;

        int x = 10;
        System.out.println();

        short a, b;

        a = 1;
        b = 2;

        List<String> list = Arrays.asList("Tiago", "JOao", "Alice");


        float ss = (float) 2.3;

        double v = Double.parseDouble("12");
        Double d = new Double("12");
        double v1 = d.doubleValue();



        StringBuilder sb;
        int inteiro = 22;
        short sh = (short) inteiro;
        System.out.println(num3);
       
        spaceIdx = custName.indexOf(" ");
        firstName = custName.substring(0, spaceIdx);
        //System.out.println(firstName);
          
	//Instantiate and initialize sb to firstName.

	// Put the full name back together, using StringBuilder append method.
	//   You can just enter the String literal for the last name.
	//   Print the full name.
        
    }

    public static void imprime(){
            int x = 3;
    }
}
