import java.util.Scanner;

public class Java_BMI {
    public static void main(String[] args) {
        double weight,height,bmi;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your weight (kilos): ");
        weight = input.nextDouble();
        System.out.println("Enter your height (meters): ");
        height = input.nextDouble();
        bmi = weight / Math.pow(height,2);
        System.out.println("Your BMI is: " + bmi);
        if (bmi < 18)
            System.out.printf("%-20.2f%s", bmi, "Underweight");
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s", bmi, "Normal");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s", bmi, "Overweight");
        else
            System.out.printf("%-20.2f%s", bmi, "Obese");
    }
}
