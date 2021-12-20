
package com.mycompany.dec_18_max_nos_generics;


public class MaximumThreeNumbers <E>{
    /*
    Use Case 5 : Generic class to take in three variables of generic type
    */
    
    E a;    // Generic variables
    E b;
    E c;
    
    // Parameterised constructor
    public MaximumThreeNumbers(E a,E b,E c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
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
    /*
    Use case 4: Genric method to find maximum
    */
    public static <E extends Comparable> void maxNumsGenerics(E a,E b,E c){
        E max;
        if ((a.compareTo(b))>0 && (a.compareTo(c))>0){
            max = a;
        } else if (b.compareTo(c)>0){
            max = b;
        } else{
            max = c;
        }
        System.out.println(" The maximun among three is " + max);
    }
    /*
    Use case 6: Extend max method to take in more than 3 parameters
    */
    public static <E extends Comparable> void maxNumsGenerics(E a,E ... args){
        E max = a;
        // Iterate over all the elements
        for (E x:args){
            if ((max.compareTo(x))<0){
            max = x;
            } 
        }
        System.out.println(" The maximum among the given is " + max);
    }
       
    public static void main(String []args){
        Integer a = 1, b =4, c= 5,d=7;
        String g = "Brid", h ="Ge", i = "Labz", j="Mimi";
        System.out.println("Welcome to BridgeLabz!");
        System.out.println("Today we shall find maximum among three numbers using Generics.");
        maxNumsGenerics(a,b,c,d);
        maxNumsGenerics(g,h,i,j);
    }
}
