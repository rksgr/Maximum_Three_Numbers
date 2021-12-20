
package com.mycompany.dec_18_max_nos_generics;


public class MaximumThreeNumbers {
    // Find maximum of three integers
    public static int maxThreeNumbers(int a,int b,int c){
        int max;
        Integer num1 = (Integer) a;
        Integer num2 = (Integer) b;
        Integer num3 = (Integer) c;

        if ((num1.compareTo(num2))>0&& (num1.compareTo(num3))>0){
            max = a;
        } else if (num2.compareTo(num3)>0){
            max  = b;
        }else{
            max = c;
        }
        System.out.println("The largest of three numbers is: "+max);
        return max;
    }
    public static void main(String []args){
        System.out.println("Welcome to BridgeLabz!");
        System.out.println("Today we shall find maximum among three numbers using Generics.");
        maxThreeNumbers(52,23,44);
    }
}
