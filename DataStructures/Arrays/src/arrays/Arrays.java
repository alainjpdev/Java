package arrays;

public class Arrays {

    public static void main(String[] args) {
        int[] intArray = new int[7];

        intArray[0] = 20;
        intArray[1] = 18;
        intArray[2] = 25;
        intArray[3] = -23;
        intArray[4] = 2;
        intArray[5] = -45;
        intArray[6] = -34;

        for (int i = 0; i < intArray.length; i++) {
            System.out.println("i = " + intArray[i]);
        }
    }
}
