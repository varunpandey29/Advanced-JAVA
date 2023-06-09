//Q6. Calculate BMI
import java.util.Scanner;
public class CA1_Q6 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Height (in meters): ");
        double h = sc.nextDouble();
        System.out.print("Enter Weight: ");
        double m = sc.nextDouble();

        System.out.println("BMI is: " + m/(h*h));
        sc.close();

    }
}
