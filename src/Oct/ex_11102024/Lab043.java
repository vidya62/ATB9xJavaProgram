package Oct.ex_11102024;

public class Lab043 {
    public static void main(String[] args) {
        String first_name = "Akshay";
        String last_name = "Kumar";
        int a= 10;
        int b=20;

        char c= 'A';


        System.out.println(first_name + last_name + a + b);
        //When used + with String, it always acts as concatenation

        System.out.println(a + b + first_name + last_name);
        // when used with other data, mathematical operations will be performed

        System.out.println(a + b + c);

        System.out.println(c);
        System.out.println(c + a + b);


        //Inorder to avoid all these, use brackets


    }
}
