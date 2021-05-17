
package bubblesort;

public class BubbleSort {

    public static void main(String[] args) {
       
        String[] stringArray = { "aaa", "bbb", "ccc", "ddd", "eee", "fff", "ggg","zzz"};
        
        for (int lastUnsortedIndex = stringArray.length -1; lastUnsortedIndex > 0;
        lastUnsortedIndex--){
            for(int i =0; i < lastUnsortedIndex; i++){
                if(stringArray[i].compareTo(stringArray[i + 1])> 0){
                    swap(stringArray, i, i+1);
                }   
            }
        }
        for ( int i = 0 ; i< stringArray.length; i++){
            System.out.println(stringArray[i]);
        }
    }
    
    public static void swap(String[] array, int i, int j){
        
        if (i==j){
            return;
        }
        String temp = array[i];
        array[i]= array[j];
        array[j]=temp;
    }
}
