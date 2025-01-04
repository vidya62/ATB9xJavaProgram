package Tasks.ex_16102024;

public class Lab015 {
    public static void main(String[] args) {

        int a= Integer.parseInt(args[0]);
        int b= Integer.parseInt(args[1]);

        int res = a>b?a:b;
        System.out.println("Largest number between a and b is :" + res);
    }
}
