/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter1;

public class InchesToMeters {

    public static void main(String[] args) {
        int x;
        int y;
        int sum;
        int div;
        int cociente;
        int i;

        x = 100;
        y = 2;
        sum = x + y;
        div = x / y;
        cociente = x % y;

//        System.out.println("sum = " + sum);
//        System.out.println("div = " + div);
//        System.out.println("cociente = " + cociente);
//        if(cociente ==0 && y!=0){
//            System.out.println(x+ " es primo  "); 
//        }
//        else{
//            System.out.println(x+ " no es primo");
//        }
        for (i = 2; i < 100; i++) {
           
            if(i%2==0)
                System.out.println(i +" es par");
        }
    }

}
