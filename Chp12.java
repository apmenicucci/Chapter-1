import java.util.Scanner;

public class Chp12 {
    public static void main(String[] args){
        String variable = "expression"; //format of variables

        //vs code tip: red circles on left of window are "break points"
        //used for run and debug to stop running/debugging
        int x = 0;
        int y = 1;
        int z = 2;
        x = y;
        y = y * 2;
        z = 3;
        //final values are x = 1, y = 2, z = 3
        int score = 5;
        score = score + 1;
        //now score = 6
        score += 1;
        //now score = 7
        //example of a compound operator
        score ++;
        //now score = 8
        score --;
        //now score= 7
        int num = 2;
        System.out.println(num/3);
        //will return 0, since variable type is integer, will truncate 
        //you have to include a double somewhere to get the double answer
        // % is called modulus, will return remainder but NOT quotient
        System.out.print(1%2);
        // you can determine if a number is odd or even with %2 (all odds return 1, all evens return 0)
    }
}