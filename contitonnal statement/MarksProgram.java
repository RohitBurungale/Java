import java.util.Scanner;

public class MarksProgram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;
        int marks;

        do {
            System.out.print("Enter 1 to input marks, 0 to stop: ");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter student's marks (0 - 100): ");
                marks = sc.nextInt();

                if (marks >= 90 && marks <= 100) {
                    System.out.println("This is Good");
                } 
                else if (marks >= 60 && marks <= 89) {
                    System.out.println("This is also Good");
                } 
                else if (marks >= 0 && marks <= 59) {
                    System.out.println("This is Good as well");
                } 
                else {
                    System.out.println("Invalid marks. Please enter between 0 and 100.");
                }
            }

        } while (choice != 0);

        System.out.println("Program ended.");
        sc.close();
    }
}
