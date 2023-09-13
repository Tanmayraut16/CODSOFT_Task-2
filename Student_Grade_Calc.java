package Codesoft;

import java.util.*;

public class Student_Grade_Calc {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("\n\n\t\tWelcome to the Grade Calculator");

        System.out.println("Enter your name : ");
        String name = sc.nextLine();

        System.out.println("Enter your roll number : ");
        int rollNumber = sc.nextInt();
        
        System.out.println("Enter the number of Subjects : ");
        int numSub = sc.nextInt();

        Students student = new Students(name, numSub, rollNumber);

        for(int i=1; i<=numSub; i++){
            System.out.print("\nEnter marks of Subject "+i+" : ");
            int marks = sc.nextInt();
            student.setMarks(i, marks);
        }

        System.out.println("\n---------------------- Results ------------------------\n");
        System.out.println("\tName : " + student.Name());

        System.out.println("\tRoll Number : " + student.RollNumber());

        System.out.println("\tTotal Marks Obtained : " + student.TotalMarks());

        System.out.println("\tAverage Percentage : "+ student.AvgPercnt());

        System.out.println("\tGrade : " + student.getGrade());
        System.out.println();
        System.out.println("--------------------------------------------------------------");

        sc.close();
    }
}
