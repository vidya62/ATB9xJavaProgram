package Oct.ex_14102024;

public class Lab057 {
    public static void main(String[] args) {

        // Type Casting -- Widening and Narrowing
        byte b=10;
//Widening -- Converting small data type to large, it can be done implicitly and explicitly

        int a = b; // Widening casted implicitly
        int a1 = (int) b; // --- Widening casted explicitly

        //Narrowing -- converting large data type to small, only done explicitly
        //Data loss

        //byte b1=int a; // gives error -- bcz narrowing cant be done implicitly

        byte b1 = (byte) a;

    }
}
