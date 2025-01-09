write a java program to get 2 numbers from the user and calculate their sum and difference using '+' and '-' operators respectively print the corresponding sum and difference of the number as output in the console
Input formate :
First input : an integer 
Second input : an integer 
Output formate:
first output will be sum of two integers
second output will be the difference of two integers



PROGRAM 



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        System.out.println(" Enter the value of num1:");
        int num1=scanner.nextInt();
        System.out.println(" Enter the value of num2:");
        int num2=scanner.nextInt();
        System.out.println(num1+num2);
        System.out.println(num1-num2);
    }
}