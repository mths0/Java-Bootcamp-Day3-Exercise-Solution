import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//    Exercise (Conditional)
        Scanner scanner = new Scanner(System.in);


//          1.Write a program that checks the role of the user
//              If the role is admin print "welcome admin"
//              If the role is superuser print "welcome superuser"
//              If the role is user print "welcome user" (tip: use if else)

        System.out.println("\n\nQuestion 1:");
        System.out.print("Enter your role: ");
        String role = scanner.nextLine();

        if (role.equalsIgnoreCase("admin")) {
            System.out.println("welcome admin");
        } else if (role.equalsIgnoreCase("superuser")) {
            System.out.println("welcome superuser");
        } else if (role.equalsIgnoreCase("user")) {
            System.out.println("welcome user");
        } else { // add an if for user
            System.out.println("Invalid input.");
        }


//            2.Take three numbers from the user and print the greatest number.
//            Test Data
//              Input the 1st number: 25
//              Input the 2nd number: 78
//              Input the 3rd number: 87
//              Expected Output : The greatest: 87

        System.out.println("\n\nQuestion 2:");
        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int thirdNumber = scanner.nextInt();

        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            System.out.println(firstNumber);
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            System.out.println(secondNumber);
        } else if (thirdNumber > firstNumber && thirdNumber > secondNumber) {
            System.out.println(thirdNumber);
        } else {
            System.out.println("numbers are equal");
        }



//            3.Write a Java program that generates an integer between 1 and 7
//                  and displays the name of the weekday.
//              Test Data
//              number: 4
//              Expected Output: Wednesday

        System.out.println("\n\nQuestion 3:");

        int randomNumber = (int) (Math.random() * 7) + 1; // use Math random
        switch (randomNumber) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid number.");
        }



//        4. Write a program that takes a numeric score as input and prints
//              the corresponding letter grade using the following grading scale:
//                  A: 90-100
//                  B: 80-89
//                  C: 70-79
//                  D: 60-69
//                  F: 0-59
//                      Enter your numeric score: 85
//                      Numeric Score: 85
//                      Letter Grade: B

        System.out.println("\n\nQuestion 4:");
        System.out.print("Enter your numeric score: ");
        int score = scanner.nextInt();
        char grade = 'N';

        if (100 >= score && score >= 90) {
            grade = 'A';
        } else if (90 > score && score >= 80) {
            grade = 'B';
        } else if (79 > score && score >= 70) {
            grade = 'C';
        } else if (69 > score && score >= 60) {
            grade = 'D';
        } else if (59 > score && score >= 0) {
            grade = 'F';
        } else {
            System.out.println("Invalid score.");
        }
        if (grade != 'N') {
            System.out.println("Numeric Score: " + score);
            System.out.println("Letter Grade: " + grade);
        }



//          5. Write a Java program that takes a person's age as input and
//              categorizes them into one of three age categories: "Child,"
//              "Teenager," or "Adult" using an if statement.
//              use an if statement to categorize the age based on the following criteria:
//                • If the age is less than 13, categorize them as a "Child."
//                • If the age is between 13 and 19 (inclusive), categorize them as a "Teenager."
//                • If the age is 20 or older, categorize them as an "Adult."
//              Sample Output:
//                  Enter your age: 25
//                  You are an Adult.

        System.out.println("\n\nQuestion 5:");
        System.out.print("Enter you age: ");
        int age = scanner.nextInt();

        if (age < 13) {
            System.out.println("You are a Child.");
        } else if (19 >= age) {
            System.out.println("You are a Teenager.");
        } else { // age > 19
            System.out.println("You are an Adult.");
        }
    }
}
