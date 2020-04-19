/*
• Maximilian Philip Oljanenko
• Program: Assingment 1
• Objective: Using a for loop the program calculates a formula for values from -3 to 3 incrementing by 0.5. Then within the for loop using if statements the program determines weather the value is positive, negative, or zero. Lastly the program print out the value for (x), (Y), and if it's zero, positive or negative.
*/

public class aone {
    public static void main(String[] args) {
      
      System.out.println("Maximilian P. Oljanenko");
      System.out.println("Program | Homework #1 | Introduction to Java Spring 2019");
      System.out.println();

       double x,y;
       for(x = -3; x <= 3; x=x+0.5){
            y = (((4) * (x) * (x) * (x))+((8) * (x) * (x))-(31 * x)-35) / (Math.sqrt(((3) * (x) * (x)) + 2 * Math.abs(x - 1.5)));
            System.out.print("X= " + x + " |  " + " Y= " + y + "     ");

            if (y == 0) {
               System.out.println("The Y Value is [0]");
            }

            if (y > 0) {
               System.out.println("The Y Value is [POSITIVE][+]");
            }

            if (y < 0) {
               System.out.println("The Y Value is [NEGATIVE][-]");
            }
   }
         System.out.println();
         System.out.println("The Program Has Completed Computing the Formula for Values -3 to 3.");
   }
 }