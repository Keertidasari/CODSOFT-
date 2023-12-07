importjava.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Student Grade Calculator");

        // Input: Take marks obtained in each subject
        System.out.print("Enter the number of subjects: ");
        int numberOfSubjects = scanner.nextInt();

        int totalMarks = 0;

        // Take marks for each subject
        for (int i = 1; i <= numberOfSubjects; i++) {
            System.out.print("Enter marks for Subject " + i + ": ");
            int subjectMarks = scanner.nextInt();

            // Validate marks
            if (subjectMarks < 0 || subjectMarks > 100) {
                System.out.println("Invalid marks! Marks should be between 0 and 100.");
                return;
            }

            totalMarks += subjectMarks;
        }

        // Calculate total marks and average percentage
        double averagePercentage = (double) totalMarks / numberOfSubjects;

        // Grade Calculation
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Display Results
        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}