
package chapter5.pkg3;


public class Chapter53 {


    public static void main(String[] args) {
        double array1[] = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0};
        double avg = 0; 
        
        for ( int i = 0 ; i< array1.length; i++){
          
           avg += array1[i];
        }
        System.out.println(avg/array1.length);
    }
    
}
