/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package debugaiproblem3;

import java.util.Scanner;

/**
 *
 * @author QUINONES_CPE113
 */
public class DebugAIProblem3 {

    /**
     * @param args the command line arguments
     */
    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter a non-negative whole number: ");
        int userNumber = input.nextInt();

        System.out.println("factorial(" + userNumber + ") result: " + factorial(userNumber));

        input.close();
    }
}


//PROBLEM 3
//1.hand-trace factorials(4) with the ai's code. what does it return and why?
//-it returns 0 instead of 24 because the base case returns 0, and multiplying any chain of
//numbers by 0 wipes out the entire calculation and turns the final answer into 0.

//2. which single line is wrong and what should it return instead?
//-the wrong line is if (n == 0) { return 0; }, and it should return 1 instead (if (n == 0) 
//{ return 1; }) because 0! equals 1 in math and 1 preserves the multiplication chain.
