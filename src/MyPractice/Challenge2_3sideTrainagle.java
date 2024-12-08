package MyPractice;

import java.util.Scanner;

public class Challenge2_3sideTrainagle {
    public static void main(String[] args) {

        //Area of a triangle using 3sides
        //s=1/2(a+b+c) and Area = sq.rt [s(s-a)(s-b)(s-c)]

        int a,b,c;
        float s;
        double area;

        System.out.println("Enter the three sides of a triangle");
        Scanner sc = new Scanner(System.in);

        a= sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();

        s=(a+b+c)/2f;
        System.out.println(s);

        area= Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area of the triangle is :" + area);

    }
}
