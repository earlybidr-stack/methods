/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package methods_10262026;

import java.util.Scanner;

/**
 *
 * @author BUHISAN_CPE113
 */
public class Methods_10262026 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //"Method"is a code that you can call.
      // "Method" Has no limit, how many methods I can make.
      // "Method" I decide what I put inside each "Method"
      // "Void" Has no Data type.  
      
    }
    
    static void PrintJemuel(){
        Scanner input = new Scanner(System.in);
        System.out.println("Pila Imong balon?");
        
        int balon=input.nextInt();
        if (balon>=10 && balon <=100){
            System.out.println("Kagamay");
        }else if(balon>=101 && balon <=500){
            System.out.println("Okay....");
        }else if (balon>=501 && balon <=1000){
            System.out.println("Dako na...");
        }else if (balon>=10001 && balon <=5000){
            System.out.println("Paldoooo!!!!");
        }
    }
    //I can decide how many I can printout by using "int no" and assigning how many I print.
    static void PrintManyTimesJemuel(int no){
        for (int i = 0; i < no; i++){
            System.out.println(i+1+"Jemuel");
        } 
    }
    static int Power(int base, int expo){
        int res=1;
        for (int i = 1; i < expo+1; i ++){
            res=base*res;
            System.out.println(res);
        }
        
        return res;
    }
}
