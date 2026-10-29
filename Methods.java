/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.methods;

/**
 *
 * @author early
 */
public class Methods {

    public static void main(String[] args) {
        // for problem 1 tester   
        int TestOdd = EvenOdd(3);
        System.out.println(TestOdd);
        int TestEven = EvenOdd(4);
        System.out.println(TestEven);

        // for problem 2 tester  
        int return0 = Triangletest(1, 2, 3);
        System.out.println(return0);

        int return1 = Triangletest(5, 5, 5);
        System.out.println(return1);

        int return2 = Triangletest(5, 5, 3);
        System.out.println(return2);

        int return3 = Triangletest(3, 4, 5);
        System.out.println(return3);

    }

    static int EvenOdd(int number) {
        return (number % 2 == 0) ? 1 : 0;
        //using question mark (?) determines wether the value is divisible by 2 then,
        // if it is divisible then it checks if it is even(1) : if it is not then it is odd(0)
    }

    static int Triangletest(int Hypo, int Opp, int Adj) {

        // Return 0 Invalid if sides are non-positive or fail triangle inequality
        if (Hypo <= 0 || Opp <= 0 || Adj <= 0
                || (long) Hypo + Opp <= Adj || (long) Hypo + Adj <= Opp || (long) Opp + Adj <= Hypo) {
            return 0; //<= a sign for Less Than or Equal To (to catch zero or negative numbers and to check if the two sides fail to form a valid triangle.
                      //|| a sign Logical OR Used between conditions so that if any single condition is true, the entire if block runs.
        }

        // Return 1 if the triangle is Equilateral (all three sides are equal)
        if (Hypo == Opp && Opp == Adj) {
            return 1; //== a sign for Equal to (to test if two side lengths match.)
        }

        // Return 2 if the triangle is Isosceles (exactly two sides are equal)
        if (Hypo == Opp || Opp == Adj || Hypo == Adj) {
            return 2;
        }

        // Return 3 if the triangle is Scalene (all three sides are different)
        if (Hypo != Opp && Opp != Adj && Hypo != Adj) {
            return 3; //!= a sign for not equal to (to ensure side lengths are completely different from each other)
        }

        return 0;
    }
}
