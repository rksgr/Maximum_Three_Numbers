
package com.mycompany.dec_18_max_nos_generics;


public class MaximumThreeNumbers {
    /*
    Use Case 1: Find maximum of three integers
    */
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
    /*
    Use Case 2: Find maximum of three Floating point numbers
    */
    public static double maxThreeNumbers(double a,double b,double c){
        double max;
        Double num1 = (Double) a;
        Double num2 = (Double) b;
        Double num3 = (Double) c;

        if ((num1.compareTo(num2))>0 && (num1.compareTo(num3))>0){
            max = a;
        } else if (num2.compareTo(num3)>0){
            max  = b;
        }else{
            max = c;
        }
        System.out.println("The largest of three float numbers is: " + max);
        return max;
    }
    /*
    Use Case 3: Find maximum of three Strings
    */   
    public static String maxThreeNumbers(String a,String b,String c){
        String max;
        if ((a.compareTo(b))>0 && (a.compareTo(c))>0){
            max = a;
        } else if (b.compareTo(c)>0){
            max  = b;
        }else{
            max = c;
        }
        System.out.println("The largest of three strings is: "+max);
        return max;
    }
    public static void main(String []args){
        System.out.println("Welcome to BridgeLabz!");
        System.out.println("Today we shall find maximum among three numbers using Generics.");
        maxThreeNumbers("Bridge","Bailey","Bunsen");
    }
}
