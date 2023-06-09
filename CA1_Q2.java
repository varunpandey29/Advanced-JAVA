import java.util.Scanner;

//Q.2Write a Java program to print the addition, multiply, subtracts, divide, and remainder of two numbers.

import java.util.Scanner;

public class CA1_Q2 {
    public static void main(String args[]){
    Scanner sc= new Scanner(System.in); 
    System.out.print("Enter first number- ");  
    int a= sc.nextInt(); 

    System.out.print("Enter second number- ");  
    int b= sc.nextInt();

    int sum = a+b;
    int sub = a-b;
    int mult = a*b;
    int div = a/b;

    System.out.println("Addition: "+sum);
    System.out.println("Subtraction: "+sub);
    System.out.println("Multiplication: "+mult);
    System.out.println("Division: "+div);
    sc.close();
}
}
