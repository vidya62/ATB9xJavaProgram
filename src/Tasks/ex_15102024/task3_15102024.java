package Tasks.ex_15102024;

public class task3_15102024 {
    public static void main(String[] args) {
    //// Find the largest of three numbers using ternary operators
        int a=10;
        int b=9;
        int c = 7;

        int res = (a>b && a>c)? a: (b>c) ? b : c ;
        System.out.println("Largest number is: " + res);
    }
}
