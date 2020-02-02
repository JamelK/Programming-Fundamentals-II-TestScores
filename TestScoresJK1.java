import java.util.Arrays;
import java.util.Scanner;

public class TestScoreJK1 {
   //Creating Arrays
   String names[]=new String[5];
   char grades[]=new char[5];
   double tests[][]=new double[5][4];
   double avgarr[]=new double[5];
   Scanner sc=null;
  
   //Default constructor
   public TestScoreJK1() {
       sc=new Scanner(System.in);
   }
  
   /*this method will get each student information
   * and populates that information into an array
   */
   public void getStudentsTestScore()
   {
       for(int i=0;i<5;i++)
       {
           //getting the name of each student
           System.out.print("Enter Name of Student "+(i+1)+" :");
           names[i]=sc.next();
           for(int j=0;j<4;j++)
           {
               //Getting the test score in each test of every student
               System.out.print(" Test "+(j+1)+" score :");
   tests[i][j]=sc.nextDouble();          
           }
           System.out.println(" ");
       }
   }
  
   /* this method will display the grade of the student
   * based on user entered name which is passed
   * as parameter to this method
   */
public char getStudentGrade(String name)
{
   char grade = 0;
   double sum,avg=0.0;
   for(int h=0;h<5;h++)
   {
   sum=0.0;
       for(int m=0;m<4;m++)
       {
           //calculating the total score in all 4 tests of each student
           sum+=tests[h][m];
       }
       //calculating average
       avg=sum/4;
      
       //Populating into an array
       avgarr[h]=avg;
      
       //based on the average test score corresponding grade will be given
       if(avg>=90 && avg<=100)
       {
           grade='A';
       }
       else if(avg>=80 && avg<=89)
       {
           grade='B';
       }
       else if(avg>=70 && avg<=79)
       {
           grade='C';
       }
       else if(avg>=60 && avg<=69)
       {
           grade='D';
       }
       else if(avg<=59)
       {
           grade='F';
       }
       grades[h]=grade;
   }
  
   //Getting the corresponding student grade
   for(int i=0;i<5;i++)
   if(names[i].equalsIgnoreCase(name))
   {
       grade=grades[i];
   }
   return grade;
}

/* This will return the average test score of a student
* whose name is passed as parameter to this method
*/
public double getStudentAvgTestScore(String name)
{
   double sum=0.0,avg=0.0;
   for(int i=0;i<5;i++)
   if(names[i].equalsIgnoreCase(name))
   {
      
           for(int k=0;k<4;k++)
           {
               sum+=tests[i][k];
           }
      
   }
   avg=sum/4;
   return avg;
}
  
//toString(0 method displays each student name,average test score and grade
   @Override
   public String toString() {
       for(int i=0;i<5;i++)
       {
           System.out.println("\n\nStudent Name :"+names[i]);
           System.out.println("Average Test Score :"+avgarr[i]);
           System.out.println("Grade :"+grades[i]);

       }
          
       return "";
   }
  
}