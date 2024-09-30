import java.util.Scanner;

public class IT24102928Lab7Q1A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int total = 0;
        String grade = "none";
        System.out.println("Enter marks for four subjects: ");
        for(int i =1;i<5;i++){
            System.out.print("Enter Subject Marks "+i+":");
            int marks = sc.nextInt();
            total += marks;
        }
        int Average = total / 4;
        System.out.println("\nAverage is: "+Average);
        if (Average<=100 && Average>=75){
            grade = "Distinction";
        }else if(Average>=50 && Average<=74 ){
            grade = "Credit";
        }else{
            grade = "Fail";
        }
        System.out.println("Overall Grade is:" +grade);
    }
}