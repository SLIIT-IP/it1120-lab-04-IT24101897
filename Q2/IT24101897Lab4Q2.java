import  java.util.Scanner;

public class IT24101897Lab4Q2 {

   public static void main(String[] args){

         Scanner input = new Scanner(System.in);

         System.out.print("Please enter exam marks (out of 100): ");
         double examMarks =input.nextDouble();


         if(examMarks < 0 || examMarks > 100)
          {
           System.out.print("Invalid input for exam marks. Terminating program");
          }

         System.out.print("Please enter lab submission marks (out of 100): ");
         double labMarks = input.nextDouble();
  
         if (labMarks < 0 || labMarks > 100)
          {
           System.out.print("Invalid input for lab submission marks. Terminating program");
          }

         System.out.print("Please enter the percentage given for the exam: ");
         double examPercentage = input.nextDouble();

         System.out.print("Please enter the percentage given for the lab submission: ");
         double labPercentage = input.nextDouble();

         if (examPercentage + labPercentage != 100)
          {
           System.out.print("The percentage must add up to 100. Terminating program");
          }

          double finalMarks = examMarks*(examPercentage/100.0) + labMarks * (labPercentage/100.0);

          System.out.println();
          System.out.print("Final Exam Mark is:" +finalMarks);

      }
}