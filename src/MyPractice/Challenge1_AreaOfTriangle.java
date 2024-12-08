package MyPractice;

import java.util.Scanner;

public class Challenge1_AreaOfTriangle {
    public static void main(String[] args) {

        //Get the values from the user
        //Area of Triangle = 1/2 *base *height

        float baseOfTriangle,heightOfTriangle ,areaOfTriangle;

        System.out.println("Enter the base and height of the triangle");
        Scanner sc = new Scanner(System.in);
        baseOfTriangle = sc.nextFloat();
        heightOfTriangle = sc.nextFloat();

        areaOfTriangle = 1/2*baseOfTriangle*heightOfTriangle;
        System.out.println("Area of the Triangle: " + areaOfTriangle);
        //The above expression will be 0, bcz the other variables are of type float
        // Hence 1/2 will act as float and returns 0.0, and the expression will be multiplied by 0

        areaOfTriangle = 1f/2f*baseOfTriangle*heightOfTriangle;
        System.out.println("Area of the Triangle: " + areaOfTriangle);

        areaOfTriangle = baseOfTriangle*heightOfTriangle/2;
        System.out.println("Area of the Triangle: " + areaOfTriangle);

        //OR

        areaOfTriangle = baseOfTriangle * heightOfTriangle * 0.5f ;
        System.out.println("Area of the Triangle: " + areaOfTriangle);
    }
}
