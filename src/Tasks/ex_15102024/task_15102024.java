package Tasks.ex_15102024;

public class task_15102024 {
    public static void main(String[] args) {
    //Nested Ternary Operators
        int score = 90;
        String grade = (score>=90)? "A" : (score>=80) ?"B" : (score>=70) ? "C" : (score>=60)? "D" :(score>=50)? "E" : "Fail"  ;

        System.out.println("The grade is: " + grade);

    }
}
