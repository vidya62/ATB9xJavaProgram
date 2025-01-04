package Tasks.ex_16102024;

import java.util.Scanner;

public class Lab014 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name: ");
        String name = sc.next();

        System.out.println("Enter the age");
        int age = sc.nextInt();

        System.out.println("Enter the Salary");
        float salary = sc.nextFloat();

        System.out.println("Name of the person is : " + name);
        System.out.println("Age of the person is : " + age);
        System.out.println("Salary of the person is : " + salary);

    }

}
