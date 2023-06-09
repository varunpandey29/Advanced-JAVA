//Q.5 Write a Java program to compute the distance between two points on the surface of earth.

import java.util.Scanner;

public class CA1_Q5 {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter x1 value: ");
    int x1 = sc.nextInt();
    System.out.println("Enter x2 value: ");
    int x2 = sc.nextInt();
    System.out.println("Enter y1 value: ");    
    int y1 = sc.nextInt();
    System.out.println("Enter y2 value: ");
    int y2 = sc.nextInt();

    int a = (x2-x1)*(x2-x1);
    int b = (y2-y1)*(y2-y1);
    int ans = a+b;
    System.out.println(Math.sqrt(ans));
    sc.close();
}
}