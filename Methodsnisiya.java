/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.methodsnisiya;

import java.util.Scanner;

/**
 *
 * @author CORESIS_CPE113
 */
public class Methodsnisiya {

    public static void main(String[] args) {
        int result = EvenOdd (1001);
        System.out.println(result);
        
    }
    static int EvenOdd(int number) {
        int state;
        if (number % 2==0){
           state = 1;
        } else{
        state = 0;
        int result = EvenOdd (1001);
        System.out.println(result);
        }
        return state;
    }
}

    
//create integer sulod s a main, after, the value is the method "call metod" example 10,in a method there is no system print only
//return then katong variable e print

//In a method there are three methods that have different apps-idea to create.