package MyPractice;

import java.util.Scanner;

public class Challenge4_Cuboid {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        float length, breadth,height;
        float totalArea, volume;

        System.out.println("Enter the length of the cuboid:");
        length = sc.nextFloat();

        System.out.println("Enter the breadth of the Cuboid:");
        breadth = sc.nextFloat();

        System.out.println("Enter the height of the cuboid:");
        height = sc.nextFloat();

        totalArea = length+breadth+height;
        System.out.println("Total area of the cuboid is : " + totalArea);

        volume = length * breadth*height;
        System.out.println("Volume of the cuboid is : " + volume);


    }
}
