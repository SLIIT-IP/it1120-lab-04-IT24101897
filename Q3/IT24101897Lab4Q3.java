import  java.util.Scanner;

public class IT24101897Lab4Q3 {

   public static void main(String[] args){

         int number;
         String result;

         Scanner input = new Scanner(System.in);

         System.out.print("Enter a number: ");
         number =input.nextInt();

         System.out.println();
         
         result = (number > 0) ? "The number is: Positive" :
                  (number < 0) ? "The number is: Negative" :
                   "The number is zero";

         System.out.print(result);       
      }
}