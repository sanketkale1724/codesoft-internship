package code_soft_project1;
import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the name of student:");
        String nameOfStudent= sc.nextLine();

        System.out.print("Enter the number of subjects: ");
        int numberOfSubjects = sc.nextInt();

        int[] marks = new int[numberOfSubjects];

        System.out.println("Enter the mark out of 100\n");
        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.print("Enter marks for Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        int totalMarks = TotalMarks(marks);

        double averagePercentage = AveragePercentage(totalMarks, numberOfSubjects);

        char grade = Grade(averagePercentage);

     
        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        sc.close();
    }

    private static int TotalMarks(int[] marks) {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    private static double AveragePercentage(int totalMarks, int numberOfSubjects) {
        return (double) totalMarks / numberOfSubjects;
    }

    private static char Grade(double percentage) {
        if (percentage >= 90) {
            return 'A';
        } else if (percentage >= 80) {
            return 'B';
        } else if (percentage >= 70) {
            return 'C';
        } else if (percentage >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
