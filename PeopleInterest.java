package assignment;

import java.util.Scanner;

class Assign {
    String gender;
    int age;

    Assign(String gender, int age) {
        this.gender = gender;
        this.age = age;
    }

    void Man() {
        if (gender.equalsIgnoreCase("Female")) {
            if (age >= 1 && age <= 58) {
                System.out.println("The interest is 8.2%.");
            } else if (age >= 59 && age <= 100) {
                System.out.println("The interest is 9.2%.");
            } else {
                System.out.println("Enter a valid age. This is invalid.");
            }
        } else if (gender.equalsIgnoreCase("Male")) {
            if (age >= 1 && age <= 58) {
                System.out.println("The interest is 8.4%.");
            } else if (age >= 59 && age <= 100) {
                System.out.println("The interest is 10.5%.");
            } else {
                System.out.println("Enter a valid age. This is invalid.");
            }
        } else {
            System.out.println("Enter a valid gender. This is invalid.");
        }
    }
}

public class PeopleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String gender = sc.nextLine().trim();
        int age = sc.nextInt();

        Assign f = new Assign(gender, age);
        f.Man();

        //sc.close();
    }
}
