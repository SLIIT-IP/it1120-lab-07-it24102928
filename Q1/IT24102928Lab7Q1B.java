import java.util.Scanner;

public class IT24102928Lab7Q1B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int student = 1; student <= 3; student++) {
            int total = 0;
            System.out.println("Student " + student);
            System.out.print("Enter marks: ");

            for (int i = 0; i < 4; i++) {
                int marks = sc.nextInt();
                total += marks;
            }

            double average = total / 4.0;
            System.out.println("Average is: " + average);

            String grade;
            if (average >= 75) {
                grade = "Distinction";
            } else if (average >= 50) {
                grade = "Credit";
            } else {
                grade = "Fail";
            }

            System.out.println("Overall Grade is: " + grade + "\n");
        }

    }
}