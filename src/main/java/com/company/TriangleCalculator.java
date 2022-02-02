package com.company;
import java.util.Scanner; // Import the Scanner class

public class TriangleCalculator {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); // Created a Scanner object
        System.out.println(
                "Hello, welcome to the right triangle calculator." + "\n"
                + "Please note that the outputs of this calculator are in degrees." + "\n");

        System.out.println("Enter in the length of the adjacent side: ");
        String adjSide = myObj.nextLine(); // Read user input for adjacent side
        // Convert string to double
        double adj = Double.parseDouble(adjSide);

        System.out.println("Enter in the length of the opposite side: ");
        String oppSide = myObj.nextLine(); //Read user input for opposite side
        double opp = Double.parseDouble(oppSide);

        // Calculate hypotenuse side of the triangle
        double hyp = Math.hypot(adj,opp);

        // Store the sine, cosine, and tangent into a variable that can be called
        double arcSin = Math.asin(opp/hyp);
        double arcCos = Math.acos(adj/hyp);
        double arcTan = Math.atan(opp/adj);
        double Sine = Math.sin(arcSin);
        double Cos = Math.cos(arcCos);
        double Tan = Math.tan(arcTan);

        System.out.println("\n"
                + "Below are the properties of the given triangle: " + "\n"
                + "Trigonometric Sine of the Triangle: " + Sine + "\n"
                + "Trigonometric Cosine of the Triangle: " + Cos + "\n"
                + "Trigonometric Sine of the Triangle: " + Tan);
    }
}
